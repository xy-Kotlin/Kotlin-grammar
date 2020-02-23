package com.xywei.cycle

fun main(args: Array<String>) {

//    testBreakLabel()
//    testContinueLabel()
    testReturn()
    testReturnLabel()
}

//for while do..while省略

//测试break标签
fun testBreakLabel() {

    loop@ for (i in 1..5) {
        for (j in 1..5) {
            if (i == 2 && j == 2) {
                break@loop
            }
            println("使用break@label:i=${i},j=${j}")


        }
    }

    println("break@label跳出整个外层循环")

    for (i in 1..5) {
        for (j in 1..5) {
            if (i == 2 && j == 2) {
                break
            }
            println("使用break:i=${i},j=${j}")
        }
    }
    println("break跳出内层循环")

}

fun testContinueLabel() {
    println("使用continue，跳出内层本次循环，从内层继续循环")
    for (i in 1..5) {
        for (j in 1..5) {
            if (i == 2 && j == 2) {
                continue
            }
            println("continue: i=${i},j=${j}")
        }
    }

    println("使用continue@label，跳出当前内层循环，从外层继续循环")
    loop@ for (i in 1..5) {
        for (j in 1..5) {
            if (i == 2 && j == 2) {
                continue@loop
            }
            println("continue@loop: i=${i},j=${j}")
        }
    }
}

fun testReturn() {

    var array = arrayOf(1, 3, 5, 7, 9)

    println("return 打断运行的代码，直接返回")

    array.forEach {
        if (it == 5) {
            return
        }
        println("return ${it}")
    }


}

fun testReturnLabel() {
    println("return@label，跳出当前代码，继续执行下一步")
    var array = arrayOf(1, 3, 5, 7, 9)

    array.forEach {
        if (it == 5) {
            return@forEach
        }
        println("return@label:${it}")
    }
}



