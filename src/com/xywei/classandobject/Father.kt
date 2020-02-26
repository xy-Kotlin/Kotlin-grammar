package com.xywei.classandobject

/**
 * 练习继承
 */
open class Father(name:String) {

    var name=""
    init {
        println("老子初始化")
        this.name=name
    }
    open fun eat() {
        println("老子:${name}，用右手吃饭")
    }

}