package com.shareutils

object TextUtils {
    fun capitalizeWords(text: String): String {
        return text
            .trim()
            .split("\\s+".toRegex())
            .joinToString(" ") {
                it.replaceFirstChar { c -> c.uppercase() }
            }
    }
}