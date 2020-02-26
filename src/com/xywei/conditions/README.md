# 条件控制语法
## 传统的 if..else 
if(condition){
}else{
}
## kotlin if..else 
可以把表达式赋予一个变量

var v=if(condition)a else b


## when 表达式
最灵活，类似Java的switch
when(变量){
值1,值2,值3->处理语句
表达式1,表达式2,表达式3->处理语句
else->处理语句
}

## 说明 
if when本来就是表达式，可以直接返回值

