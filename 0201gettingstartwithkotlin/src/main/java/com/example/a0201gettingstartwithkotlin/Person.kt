package com.example.a0201gettingstartwithkotlin

open class Person (val name: String, val age: Int){

    fun eat(){
        println("$name is eating. He is $age years old" )
    }
}