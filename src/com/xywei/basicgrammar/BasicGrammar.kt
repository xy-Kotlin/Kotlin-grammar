//文件的开头一般都是包声明，同Java
package com.xywei.basicgrammar


fun main(args: Array<String>) {
    var a = 1
    var b = 2
//    var result=testAdd(1,2)
//    var result = testAdd3(a, b)
//    println("${a}+${b}的结果是${result}")//字符串魔板
//    printHello()
//    varargs(1,2,3,4,5,6)

//    lambda表达式，也就是匿名函数
//    var result:(Int,Int)->Int={x,y->x+y}
//    println(result(a,b))
    range()
}

//通用函数定义格式：fun 函数名(参数名1:参数数据类型1,参数名2,参数数据类型2,...):返回值数据类型{}
fun testAdd(a: Int, b: Int): Int {
    return a + b
}

//简洁写法1，返回值类型自动判断
fun testAdd2(a: Int, b: Int) = a + b

//简洁写法2，如果方法有public修饰，必须要显示写出
public fun testAdd3(a: Int, b: Int): Int = a + b

//无返回值的时候
fun printHello(): Unit {
    print("无返回值")
}

//可变参数，使用vararg修饰
fun varargs(vararg vars: Int) {
    for (i in vars) {
        println(i)
    }
}

//区间
fun range(): Unit {

    var r = 1..4
    for (i in r) {
        println("顺序：${i}")
    }

    //倒过来什么都不打印
    var r2 = 4..1
    for (i in r2) {
        println("倒序：${i}")
    }

    var r3 = 1..10
    for (i in r3 step 2) {
        println("区间跳步打印基数${i}")
    }

    //downto..step，倒序
    // 期望：(2,i+2]，应该是3,5,7,9
    //运行的结果是最低为[2,i+2]
    for (i in 10 downTo 1 step 2) {
        println("downTo 1 step 2的结果是${i}")
    }

    for (i in 10 downTo 3 step 2) {
        println("10开始，step2，倒序打印偶数，最小值为4：${i}")
    }

    for (i in 10 downTo 3 step 3) {
        println("10开始，step3，倒序打印偶数，最小值为4：${i}")
    }

    //使用util排除元素，结尾是开区间
    for(i in 2 until 20 step 2){
        println("打印1-20的偶数${i}")
    }
}
