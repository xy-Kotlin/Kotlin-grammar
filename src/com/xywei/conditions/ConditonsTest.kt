package com.xywei.conditions

fun main(args: Array<String>) {
//    testIf()
//    testWhen1()
    testWhen2()
}

fun testIf() {
    var a = 1
    var result = if (a > 1) println("a>1") else println("a 不大于1")
    print(result)
}

fun testWhen1() {
    var a = 3
    when (a) {
        3, 5 -> println("3or5")
        3 -> println("a=3")
        else -> println("else了")
    }
}

fun testWhen2() {

    var array = arrayOf("a", "b", "c")
    when {
        "a" in array -> {
            println("true")
        }
        else -> println("false")
    }
}




