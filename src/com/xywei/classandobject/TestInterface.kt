package com.xywei.classandobject

class TestInterface : IA, IB {
    override var stringA: String = "接口中的属性被实现类覆盖，必须被覆盖"


    override fun barA() {
    }

    override fun barB() {
    }

    override fun foo() {
        super<IA>.foo()
        super<IB>.foo()
    }


}

fun main(args: Array<String>) {
    var testInterface=TestInterface();
    testInterface.foo()
}