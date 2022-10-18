package com.fssmsl.legymx.api

import java.security.MessageDigest

object LegymSigner {

    private const val salt = "itauVfnexHiRigZ6"

    private fun toHex(byteArray: ByteArray): String {
        val result = with(StringBuilder()) {
            byteArray.forEach {
                val hex = it.toInt() and (0xFF)
                val hexStr = Integer.toHexString(hex)
                if (hexStr.length == 1) {
                    this.append("0").append(hexStr)
                } else {
                    this.append(hexStr)
                }
            }
            this.toString()
        }
        return result
    }

    private fun sha1(str:String): String {
        val digest = MessageDigest.getInstance("SHA-1")
        val result = digest.digest(str.toByteArray())
        return toHex(result)
    }

    fun signDigital(vararg data: String) : String {
        var str = ""
        data.forEach {
            str += it
        }
        str += salt
        return sha1(str)
    }

}