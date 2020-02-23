package com.xywei.basicdatatype

fun main(args: Array<String>) {

//    testBasicDataType()
//    testArray()

    testString()
}

/**
 * 测试基本类型
 */
fun testBasicDataType() {
    var a_byte: Byte = 1
    var b_short: Short = 1024
    var c_int: Int = 222222222
    var d_long: Long = 38L
    var e_float: Float = 888.8111286111111111111111111111111111111111111111111111111111111111111111111133338F
    var f_double: Double = 8888.888881234565811189911
    println(a_byte)
    print(b_short)
    println(c_int)
    println(d_long)
    println(e_float)
    println(f_double)
}

fun testArray() {
    var array = arrayOf<String>("a", "b", "c")
    for (str in array) {
        println("常规字符串数组有: ${str}")
    }

    var array2 = Array<Int>(10, { i -> (i) })
    for (i in array2) {
        println("函数工厂方式创建整数的数组:${i}")
    }
}

fun testString() {
    var str = """
        我是多行
        的文本
        看到就知道了
        要使用三对
        的双引号
        """
    var str1 = """
        我是多行
        的文本
        看到就知道了
        要使用三对
        的双引号
        """.trimIndent()
    println(str)
    println(str1)
}