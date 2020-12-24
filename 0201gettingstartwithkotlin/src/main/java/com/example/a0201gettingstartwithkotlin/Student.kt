package com.example.a0201gettingstartwithkotlin

class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age){
    // 创建对象的时候调用
    init {
        println("sno is $sno")
        println("grade is $grade")
    }
}

// 只有次构造函数
class Student1: Person{
    constructor(name: String, age: Int): super(name, age)
}

class Student2(name: String, age: Int): Person(name, age), Study{
    override fun readBooks() {
        println("$name is reading.")
    }

//    override fun doHomework() {
//        println("$name is doing homework.")
//    }
}