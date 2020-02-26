package com.xywei.classandobject

/**
 * 练习类的主构造方法，次构造方法，如何创建对象，以及初始化对象
 */
//主构造方法不允许有代码
class Person constructor(name: String) {

    var p = "my name is ${name}"

    //getter/setter测试
    var addr: String = "AAAA"
        get() = field.toLowerCase()
        set(value) {
            if (value == null) "BBB" else "CCC"
        }

    var number: Int = 0
        get() = field
        set(value) {
            if (value > 10) 1 else value
        }

    //初始代码块
    init {
        println("我是init代码块")
    }

    //次构造方法，必须经过主构造方法
    constructor(name: String, age: Int) : this(name) {
        println("我是次构造方法1")
    }

    constructor(name: String, age: Int, address: String) : this(name) {
        println("我是次构造方法2")
    }

    fun sayHello(greet: String) {
        println("${greet}, ${p}")
    }
}

fun main(args: Array<String>) {

    var person = Person("IT工作者")
    var greet = "jack"
    person.number = 9
    person.sayHello(greet)
    println("${person.addr}, ${person.number}")
}