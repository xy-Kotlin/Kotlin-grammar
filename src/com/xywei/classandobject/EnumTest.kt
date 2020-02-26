package com.xywei.classandobject

/**
 * 枚举类，需要声明主构造器为private，然后重写toString()
 */
enum class EnumTest private constructor(var v: String) {
    SPRING("春天"), SUMMER("夏天"), AUTUNM("秋天"), WINTER("冬天");

    override fun toString(): String {
        return v
    }


}

fun main(args: Array<String>) {
    println(
        "现在是${EnumTest.SPRING}"
    )
}