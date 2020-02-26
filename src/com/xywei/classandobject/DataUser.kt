package com.xywei.classandobject

/**
 * 数据类测试，构造方法必须声明var / val
 */
data class DataUser(var name: String, var age: Int) {



}

fun main(args: Array<String>) {
    var oldUser = DataUser("jack", 30)
    var newUser = oldUser.copy(age = 33)
    println("oldUser:${oldUser}")
    println("newUser:${newUser}")
    //数据解构
    var (name1) =oldUser
    println("数据解构name:${name1}")
}