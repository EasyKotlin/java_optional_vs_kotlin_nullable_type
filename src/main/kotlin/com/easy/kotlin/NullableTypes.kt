package com.easy.kotlin

fun main(args: Array<String>) {
    println(strLength(null))
    println(strLength("abc"))
}

fun strLength(s: String?): Int {
    return s?.length ?: 0
}