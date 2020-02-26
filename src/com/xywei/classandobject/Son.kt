package com.xywei.classandobject

class Son(name:String, age:Int):Father(name) {

    var age=0
    init {
        println("儿子初始化")
        this.age=age
        this.name=name
    }

    override  fun eat() {
        println("儿子名字: ${name}，年龄：${age} 用左手吃饭")
    }
}

fun main(args:Array<String>){
    var son =Son("大头",12)
    son.eat()
}