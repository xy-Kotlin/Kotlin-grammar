package com.xywei.classandobject

fun Person.testExtends(name: String) {

    println("拓展函数参数：${name}，person类的addr：${addr}")

}

fun main(args: Array<String>) {
    var p = Person("大宝")
    p.testExtends("testExtends")
}