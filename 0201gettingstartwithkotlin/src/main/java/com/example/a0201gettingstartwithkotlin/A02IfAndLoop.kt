package com.example.a0201gettingstartwithkotlin

fun main(){

//    // if 语句
//    fun largerNumber(num1: Int, num2: Int): Int {
//        return if (num1 > num2){
//            num1
//        }else{
//            num2
//        }
//    }
//
//    fun largerNumber1(num1: Int, num2: Int) = if (num1 > num2) num1 else num2
//
//    println(largerNumber(25, 32))
//    println(largerNumber1(25, 32))

//    // when 语句
//    fun getScore(name: String) = when(name){
//        "Tom" -> 86
//        "Jim" -> 77
//        "Jack" -> 95
//        "Lily" -> 100
//        "Betty" -> {50 * 3}
//        else -> 0
//    }
//    println(getScore("Tom"))
//    println(getScore("Lily"))
//    println(getScore("Betty"))

//    fun checkNumber(num: Number){
//        when (num){
//            is Int -> println("number is Int")
//            is Double -> println("number is Double")
//            is Float -> println("number is Float")
//            else -> println("number not support")
//        }
//    }
//
//    val num = 10
//    val num1 = 10.01
//    val num2 = 10.01f
//    // Long 类型
//    val num3 = 10L
//    checkNumber(num)
//    checkNumber(num1)
//    checkNumber(num2)
//    checkNumber(num3)

//    fun getScore(name: String) = when{
//        name.startsWith("Tom") -> 86
//        name == "Jim" -> 77
//        name == "Jack" -> 95
//        name == "Lily" -> 100
//        else -> 0
//    }
//
//    println(getScore("Tom123"))
//    println(getScore("Tom456"))

    // 循环语句

//    // 0 到 10 闭区间
//    val range = 0..10
//
//    for (i in range){
//        println(i)
//    }

//    // [0, 10)
//    val range = 0 until 10
//    // step 间隔 相当于 i = i + 2
//    for (i in range step 2){
//        println(i)
//    }


    // [10, 1] 降序区间
    val range = 10 downTo 1
    for (i in range){
        println(i)
    }





}