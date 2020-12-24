package com.example.a0201gettingstartwithkotlin

import kotlin.math.max

fun main() {

//    val a = 10
//    println("a = $a")

//    var a: Int = 10
//    a *= 10
//    println("a = $a")

//    fun largerNumber(num1: Int, num2: Int): Int {
//        return max(num1, num2)
//    }

//    简写
    fun largerNumber(num1: Int, num2: Int) = max(num1, num2)

    val a = 37
    val b = 40
    val max = largerNumber(a, b)
    println("larger number is $max")


}