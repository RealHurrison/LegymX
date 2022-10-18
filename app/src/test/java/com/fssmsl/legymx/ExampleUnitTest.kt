package com.fssmsl.legymx

import com.fssmsl.legymx.api.LegymClient
import com.fssmsl.legymx.api.LegymServiceSingleton
import com.fssmsl.legymx.api.LegymSigner
import com.fssmsl.legymx.api.data.activity.*
import com.fssmsl.legymx.api.data.login.LoginRequest
import com.fssmsl.legymx.api.data.run.RunningLimitRequest
import org.junit.Assert.*
import org.junit.Test
import java.time.DayOfWeek
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    companion object {
        val legymService = LegymServiceSingleton.legymService
    }

    @Test
    fun test_api(){

    }
}