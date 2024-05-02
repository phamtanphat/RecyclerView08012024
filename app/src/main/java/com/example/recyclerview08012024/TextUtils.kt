package com.example.recyclerview08012024

import java.lang.Math.pow
import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.round

object TextUtils {

    fun formatDistance(distance: Int): String {
        return if (distance < 1000) {
            "$distance m"
        } else {
            val result = (distance.toFloat() / 1000.toFloat())
            val digitZero = ((result * 100) % 100).toInt() == 0
            if (result % 1 != 0f && !digitZero) {
                val cifras = 10.0.pow(2.0)
                val finalResultString = String.format("%.1f", round(result * cifras) / cifras)
                val finalResultFloat = finalResultString.toFloat()
                if (finalResultFloat % 1.0f == 0f) {
                    "${finalResultFloat.toInt()} km"
                } else {
                    "$finalResultString km"
                }
            } else {
                "${result.toInt()} km"
            }
        }
    }
}