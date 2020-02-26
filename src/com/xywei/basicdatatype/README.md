# 基本数据类型

Byte，1个字节

Short，2个字节

Int，4个字节

Long，8个字节，以L结尾

Float，4个字节，以F或者f结尾，小数最多为4-5位，不准确

Double，8个字节，小数最多为12位，不准确

小数有四舍五入


## 进制
***注意，Kotlin不支持八进制***
1. 二进制以0b开头
2. 十六进制以0x开头

# 字符
Char

# 字符串
String
多行字符串使用三对双引号"""""""
删除多余的前置空格，使用trimIndent()

# 数组
## 创建方法1
var array1=arrayOf<Int>(1,3,5)
var array2=arrayOf<String>("2","b")
类似Java泛型
## 创建方法2 工厂函数
var array3=Array(10,{i->(i)})//(size，方法逻辑)

# 布尔
Boolean

