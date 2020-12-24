package com.example.a0201gettingstartwithkotlin

    fun main() {
    //    val p = Person()
    //    p.name = "Jack"
    //    p.age = 19
    //    p.eat()

    //    val student = Student("a123", 5, "Jack", 19)
    //    student.eat()

        val stu = Student2("Jack", 19)
        doStudy(stu)
    }

    fun doStudy(study: Study) {
        study.readBooks()
        study.doHomework()
    }
