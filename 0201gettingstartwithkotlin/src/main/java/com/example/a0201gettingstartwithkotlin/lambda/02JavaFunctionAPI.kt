package com.example.a0201gettingstartwithkotlin.lambda

fun main(){
    Thread(object : Runnable{
        override fun run() {
            println("Thread is running")
        }
    }).start()
    // 简化版本
    Thread(Runnable { println("Thread is running") }).start()

    // 简化版本
    Thread {
        println("Thread is running")
    }.start()

}