package com.example.a0201gettingstartwithkotlin.lambda

fun main(){
//    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    println("--------------------")
//    println("不可变 List 集合")
//    for (fruit in list){
//        println(fruit)
//    }
//    println("--------------------")
//
//    val varList = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    varList.add("Watermelon")
//    println("可变 List 集合")
//    for (fruit in varList){
//        println(fruit)
//    }
//    println("--------------------")
//
//    val set = setOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    println("不可变 Set 集合")
//    for (fruit in set){
//        println(fruit)
//    }
//    println("--------------------")
//
//    val varSet = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    varSet.add("Watermelon")
//    println("可变 Set 集合")
//    for (fruit in varSet){
//        println(fruit)
//    }
//
//    val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
//    for ((fruit, number) in map){
//        println("fruit is $fruit, number is $number")
//    }

//    val list1 = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    val lambda = {fruit: String -> fruit.length}
//    val maxLengthFruit = list1.maxBy(lambda)
//    println(maxLengthFruit)

    val list1 = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val maxLengthFruit1 = list1.maxBy { fruit: String -> fruit.length}
    val maxLengthFruit2 = list1.maxBy { fruit -> fruit.length}
    val maxLengthFruit3 = list1.maxBy { it.length}
    println(maxLengthFruit1)
    println(maxLengthFruit2)
    println(maxLengthFruit3)

    val newList = list1.map { it.toUpperCase() }
    for (fruit in newList){
        println(fruit)
    }

    println("----------------------")
//    长度小于等于 5 的大写输出 filter 函数
    val newListFilter = list1.filter { it.length <= 5 }.map { it.toUpperCase() }
    for (fruit in newListFilter){
        println(fruit)
    }

    // any all 函数
    println("----------------------")
    println("any all 函数")
    val list2 = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val anyResult = list2.any {it.length <= 5}
    val allResult = list2.all {it.length <= 5}
    println("anyResult is $anyResult, all result is $allResult")
}