package com.fssmsl.legymx.api

import android.annotation.SuppressLint
import com.fssmsl.legymx.api.data.login.LoginRequest
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.net.Proxy
import java.security.SecureRandom
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import java.util.concurrent.TimeUnit
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

object LegymServiceSingleton{

    private const val BASE_URL = "https://cpes.legym.cn/"

    //private val UA = getDefaultUserAgent(null)

    @Deprecated("FOR TEST ONLY")
    private const val UA = "Mozilla/5.0 (Linux; Android 10; Redmi K20 Pro Premium Edition Build/QKQ1.190825.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/83.0.4103.106 Mobile Safari/537.36"

    private val okHttpClient: OkHttpClient = getUnsafeOkHttpClient().newBuilder()
        .callTimeout(30, TimeUnit.SECONDS)
        .proxy(Proxy(Proxy.Type.HTTP, java.net.InetSocketAddress("127.0.0.1",8080)))
        .addInterceptor { chain ->
            val request = chain.request()
            val newRequestBuilder = request.newBuilder()
                .header("User-Agent", UA)

            if(request.header("Authorization") == null){
                newRequestBuilder.header("Authorization", "")
            }

            if(request.header("Organization") == null){
                newRequestBuilder.header("Organization", "")
            }

            chain.proceed(newRequestBuilder.build())
        }
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .client(okHttpClient)
        .build()

    private fun getUnsafeOkHttpClient(): OkHttpClient {
        return try {
            val trustAllCerts: Array<TrustManager> = arrayOf(
                @SuppressLint("CustomX509TrustManager")
                object : X509TrustManager {
                    @SuppressLint("TrustAllX509TrustManager")
                    @Throws(CertificateException::class)
                    override fun checkClientTrusted(
                        chain: Array<X509Certificate?>?,
                        authType: String?
                    ) {
                    }

                    @SuppressLint("TrustAllX509TrustManager")
                    @Throws(CertificateException::class)
                    override fun checkServerTrusted(
                        chain: Array<X509Certificate?>?,
                        authType: String?
                    ) {
                    }

                    override fun getAcceptedIssuers(): Array<X509Certificate> {
                        return arrayOf()
                    }

                }
            )

            val sslContext: SSLContext = SSLContext.getInstance("SSL")
            sslContext.init(null, trustAllCerts, SecureRandom())
            val sslSocketFactory: SSLSocketFactory = sslContext.socketFactory
            val builder = OkHttpClient.Builder()
            builder.sslSocketFactory(sslSocketFactory, trustAllCerts[0] as X509TrustManager)
            builder.hostnameVerifier { _, _ -> true }
            builder.build()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    val legymService: LegymService = retrofit.create(LegymService::class.java)
}

class LegymClient {
    companion object {
        val legymService = LegymServiceSingleton.legymService
    }
    fun login(loginRequest: LoginRequest) = legymService.login(loginRequest)
}