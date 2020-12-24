# 第二章 探究新语言，快速入门 Kotlin 编程 

## 难点

- 2.6 Lambda 编程

  特别是 2.6.3 中的 Java 函数式 API 的使用，第一遍没看懂

## 2.3 变量和函数

### 2.3.1 变量

#### 关键字

- val （value）第一次赋值之后不可再被赋值
- var （variable）变量，可多次赋值

**永远优先使用 val 来声明一个变量，当 val 没有办法满足你的需求时再使用 var**

#### 数据类型

Kotlin 中只有对象数据类型（Java 中称为包装类型）

| Java 基本数据类型 | Kotlin 对象数据类型 | 说明         |
| ----------------- | ------------------- | ------------ |
| int               | Int                 | 整型         |
| long              | Long                | 长整型       |
| short             | Short               | 短整型       |
| float             | Float               | 单精度浮点型 |
| double            | Double              | 双精度浮点型 |
| boolean           | Boolean             | 布尔型       |
| char              | Char                | 字符型       |
| byte              | Byte                | 字节型       |

### 2.3.2 函数

### 逻辑控制

#### if

#### when

## 2.5 面向对象编程

### 2.5.2 继承与构造函数

- Kotlin 中类默认不可被继承，需要使用 open 关键字使得可被继承

#### 主构造函数

Kotlin 主构造函数就是 Java 中的无参构造函数

Kotlin 次构造函数就是 Java 中的有参构造函数，可多个，部分参数给默认值

每个类默认有一个不带参数的主构造函数，特点：没有函数体

#### 次构造函数

次构造函数调用主构造函数，部分参数设定默认值。次构造函数基本不用，用后面的 `2.8.2 函数的参数默认值`  代替。此处跳过。

#### 仅有次构造函数 无主构造函数

父类名字后的括号可以去掉不写（括号的意思就是调用主构造函数），同时，因为子类没主构造函数，子类名字后也没有括号。次构造函数需要用 `super()`调用父类构造方法

### 类修饰符

| 修饰符    | Java                               | Kotlin             |
| --------- | ---------------------------------- | ------------------ |
| public    | 所有类可见                         | 所有类可见（默认） |
| private   | 当前类可见                         | 当前类可见         |
| protected | 当前类、子类、同一包路径下的类可见 | 当前类、子类可见   |
| default   | 同一包路径下的类可见（默认）       | 无                 |
| internal  | 无                                 | 同一模块中的类可见 |

### 数据类与单例

数据类：类名前加 `data`

单例类：类名前加 `object`

## 2.6 Lambda 编程

### 2.6.1 集合

#### List 集合

- listOf 初始化不可变集合，无法对集合进行添加、修改、删除操作
- mutableListOf 初始化可变集合

#### Set 集合

用法与 List 集合几乎一模一样，不过 Set 集合底层使用 hash 映射机制存放数据，集合中的元素无法保证有序，这和 List 集合不同

- setOf 初始化不可变集合，无法对集合进行添加、修改、删除操作
- mutableSetOf 初始化可变集合

#### Map

- mapOf

  ```kotlin
  val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
  for ((fruit, number) in map){
      println("fruit is $fruit, number is $number")
  }
  ```

### 2.6.2 集合的函数式 API

Lambda 表达式的语法结构

`{参数名1: 参数类型, 参数名2: 参数类型 -> 函数体}`

参数列表结尾使用 `->` ，表示参数列表结束，函数体开始

函数式 API

- map
- filter
- any
- all

### 2.6.3 Java 函数式 API

- Java 单抽象方法接口：接口中只有一个代实现方法

- Kotlin 中 new 对象不用 new，改用 `object` 关键字

  ```kotlin
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
  ```

  单抽象方法接口这样写不会引起歧义，所以可以用 Lambda 表达式写法。

Java 函数式 API 的使用都仅限于从 Kotlin 中调用 Java 方法，并且单抽象方法接口也必须是由 Java 语言定义。因为 Kotlin 中有专门的高阶函数来实现更加强大的自定义函数式 API 功能，从而不需要像 Java 这样借助单抽象方法接口来实现

## 2.7 空指针检查

### 2.7.1 可空类型系统

- 编译时判空检查 机制几乎杜绝了空指针异常

- 可为空类型：在类型名后面加上 `？`

  - String?
  - Int?

- 可为空的对象方法的调用 `?.`

  a?.doSomething()：a 对象不为空调用 doSomething 方法

- `?:`

  ```kotlin
  val c = a?:b
  ```

  a 不为空返回 a，否则返回 b

- 上两条联合使用

- 非空断言工具 `!!`

  - Kotlin 空指针检查工具并不是万能的，确定有判空操作且 Kotlin 检查说有空指针异常，可使用此符号。

  - 但是当你想使用`非空断言工具的时候`，最好提醒一下自己，是不是还有更好的实现方式，你最自信这个对象不会为空的时候，其实可能就是一个潜在空指针异常发生的时候

- let
  - 它是一个函数，常配合 `?.` 操作符简化代码
  
  - let 函数可以处理全局变量的判空问题而 if 语句不可以
  
    ```kotlin
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
    ```

## 2.8 Kotlin 中的小魔术

### 2.8.1 字符串内嵌表达式

- `${变量名}`

  表达式只有一个变量的时候，可以去掉大括号 `$变量名`

### 2.8.2 函数的参数默认值

- 定义方法参数时赋值，调用时若不传值进去，则使用默认值

  ```kotlin
  fun printParams(num: Int, str: String = "hello"){
      println("num is $num, str is $str")
  }
  ```

- 键值对方式传参（貌似 Python 也有这种）

- 代替次构造函数，给主构造函数部分参数赋予默认值

