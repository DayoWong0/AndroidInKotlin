package com.example.a0201gettingstartwithkotlin.nullpointer

import com.example.a0201gettingstartwithkotlin.Student
import com.example.a0201gettingstartwithkotlin.Student2
import com.example.a0201gettingstartwithkotlin.Study


var content: String? = "hello"
fun main(){
//    doStudy(null)
//    doStudy(null)
//    val stu = Student2("Jack", 16)
//    doStudy(stu)


//    val a = null
//    val c = a ?: 0
//    println(c)

    if (content != null){
        printUpperCase()
    }

    printParams(123)
    printParams(123, "this is a string")
    printParams(str = "this is a string")


}

fun printUpperCase() {
    val upperCase = content!!.toUpperCase()
    println(upperCase)
}

fun doStudy(study: Study?){
    study?.readBooks()
    study?.doHomework()
}

fun doStudy1(study: Study?){
    study?.let { stu ->
        stu.readBooks()
        stu.doHomework()
    }
}

fun doStudy2(study: Study?){
    study?.let {
        it.readBooks()
        it.doHomework()
    }
}

fun getTextLength(text: String?) = text?.length ?: 0

fun printParams(num: Int = 1000, str: String = "hello"){
    println("num is: $num, str is: $str")
}



