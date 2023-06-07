#   目录

1、用户交互Scanner

2、顺序结构

3、选择结构

4、循环结构

5、break & continue

6、练习 

# 1 Scanner对象

- 之前我们学的基本语法中我们没有实现程序和人的交互，但java给我们提供了这样一个工具类，我们可以获取用户的输入。java.util.Scanner是java5的新特征，我们可以通过Scanner类获取用户的输入。
- 基本语法：

```java
Scanner s = new Scanner(System.in);
```

- 通过Scanner类的next()与nextLine()方法获取输入的字符串，在读取前我们一般需要使用hasNext()与hasNextLine()判断是否还有输入的数据。 
- Net():
  - 1、一定要读取到有效字符后才可以结束输入。
  - 2、对输入有效字符之前遇到的空白，next()方法会自动将其去掉。
  - 3、只有输入有效字符后才将其后面输入的空白作为分隔符号或者结束符。
  - 4、next()不能得到带有空格的字符一串。

- nextLine():
  - 1、以enter为结束符，也就是说nextLine()方法返回的是输入回车之前的所有符。
  - 2、可以获得空白。  

# 2 顺序结构

- JAVA的基本结构就是顺序结构，除非特别指明，否则就按照顺序一句一句执行。
- 顺序结构是最简单的算法结构。

```flow
a=>start: --开始--
c=>operation: --A--
b=>operation: --B--
e=>end: --结束--
a->c->b->e
 

 




```

- 语句与语句之间，框与框之间是按从上到下的顺序进行的，它是由若干个依次执行处理步骤组成的，**他是任何一个算法都离不开的一种基本算法结构**。

# 3选择结构

- if单选择结构
- if双选择结构
- if多选择结构
- 镶套的if结构
- switch多选结构

## if单选择结构

- 我们很多时候要去判断一个东西是否可行，然后我们才去执行，这样一个过程在程序中用if语句来表示 

```flow
st=>start: 开始
con=>condition: 布尔表达式
op=>operation: 语句
op2=>operation: 语句
op3=>operation: 语句
su=>subroutine: 子流程
ed=>end: 结束
st->op->con
con(yes)->op2
op2->op3
con(no) ->op3 
```

- 语法：

```java
if(布尔表达式){
  //如果布尔表达式为true将执行代码 
}
```

## if双选结构

- 那现在有个需求，公司要收购一个软件，成功了，给人支付100万元，失败了，自己找人开放，这样的需求用一个if就搞不定了，我们需要一个双选结构，所以就有if-else结构。

```flow
st=>start: 开始
op1=>operation: 语句
op2=>operation: 语句2
op3=>operation: 语句3
op4=>operation: 语句4
condi=>condition: 布尔表达式
ed=>end: 结束框
st->op1->condi
condi(yes)->op2
condi(no)->op3
op2->op4
op3->op4
op4->ed
```

- 语法

```java
if(布尔表达式){
  //如果布尔表达式的值为ture 
}else{
  //如果布尔表达式的值为false
}
```

## if多选结构

- 我们发现刚才的代码不符合实际情况，真实的情况还可能存在ABCD，存在区间多级判断，比如90-100就是A，80-90就是B...等等，在生活中我们很多时候选择也不仅仅只有两，所以我们要一个多选择结构来处理类似的问题。

```flow
st=>start: 开始
op1=>operation: 语句
op2=>operation: 语句1
op3=>operation: 语句2
op4=>operation: 语句3
op5=>operation: 语句4
op6=>operation: 语句5
condi1=>condition: 布尔表达式1
condi2=>condition: 布尔表达式2
condi3=>condition: 布尔表达式3
ed=>end: 结束框
st->op1
op1(right)->condi1(no)->condi2(no)->condi3(no)->op5
condi1(yes)->op2
condi2(yes)->op3
condi3(yes)->op4
op2->op6
op3->op6
op4->op6
op5->op6
op6->ed
```

- 语法

```java
if(布尔表达式1){
  //如果布尔表达式1的值为ture执行代码
}else if{
  //如果布尔表达式2的值为ture执行代码
}else if{
  //如果布尔表达式3的值为ture执行代码
}else{
  //如果以上布尔表达式的值不为ture执行代码
}
```

## 嵌套的if结构

- 使用嵌套的if else语句是合法的，也就是说你可以在另一个if或者else if 语句中使用if或者else if语句。你可以像if语句一样嵌套else if...else
- 语法

```java
if(布尔表达式1){
  ////如果布尔表达式1的值为true执行代码
  if(布尔表达式2){
   	////如果布尔表达式2的值为true执行代码
  }
}
```

- 思考？我们需要寻找一个数，1-100之间。 

## switch 多选择结构

- 多选择结构还有一个实现方式就是switch cass语句。
- switch case语句判断一个 变量与一系列值中某个值是否相等，每个值称为一分枝。

```java
switch(expression){
  case value:
    //语句
		break;//可选
  case value:
    //语句
    break;//可选
    //你可以有任意数量的case语句
  default://可选
    //语句
}
```

- switch语句中变量类型可以是：
  - byte、short、int或者char。
  - 从java se7开始
  - switch 支持字符串String类型
  - 同时case标签必须为字符串常量或字面量。   

## 4循环结构

- while 循环
- do..while循环
- for循环
- 在java5中引入了一种主要用于数组的增强循环。 

## while循环

- while是最基本的循环，它的结构为：

```java
while(布尔表达式){
  //循环内容
}
```

- 只要布尔表达式为true，循环就会一直执行下去。
- 我们大多数情况是会让循环停止下来，我们需要一个表达式失效的方式来结束循环。
- 少部分情况需要循环一直执行，比如服务器的请求响应监听等。
- 循环条件一直为true就会造成无限循环（死循环），我们正常的业务编程中应该尽量避免死循环。会影响程序性能或者造成程序卡死奔溃！
- 思考：计算1+2+3...+100=?

## do while循环

- 对于while语句而言，如果不满足条件，则不能进入循环。但有时我们需要即使不满足条件，也至少执行一次。
- do...while循环和while循环相似，不同的是，do...while循环至少执行一次。

```java
do{
  //代码语句
}while(布尔表达式);
```

- while和do-while的区别：

  - while先判断后执行。do-while是先执行后判断！
  - do...while总是保证循环体会被至少执行一次！这是他们主要差别。

## For循环

- 虽然所有循环结构都可以用while或者do...while表示，但java提供了另一种语句----for循环，使一些循环结构变得更加简单。
- for循环语句是支持迭代的一种通用结构，是最有效，最灵活的循环结构。
- for循环执行的次数是执行前就确定的。语句格式如下：

```java
for(初始化;布尔表达式;更新){
  //代码语句
}
```

-   练习1:计算0到100之间的奇数和偶数的和
-   练习  2:用while或for循环输出1-1000之间能被5整除的数，并且每行输出3个
- 练习3:打印九九乘法表   

## 增强for循环

- 这里我们先只见一面，做个了解，之后数组我们重点使用
- java5引入了一种主要用于数组或集合的增强模型for循环。
- java增强for循环法格式如下：

```java
for(声明语句:表达式){
  //代码
}
```

- 声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定循环语句块，其值与此时数组元素的值相等。
- 表达式：表达式是要访问的数组名，或者是返回值为数组的方式。 

## break continue

- break在任何循环语句的主体部分，均可用break控制循环的流程。break用于强行退出循环，不执行循环中剩余的语句。（break语句也在switch语句中使用）
- continue语句用在循环语句体中，用于终止循环某次过程，即跳过循环体中尚未执行的语句，接着进行下一次是否执行循环的判断。
- 关于goto关键字
  - goto关键字很早就在程序设计语言中出现。尽管goto仍是java的一个保留字，但并未在语言中得到正式使用；java没有goto。然而，在break和continue着两个关键字的身上，我们仍然能看出一些goto的影子----带标签的break和continue。
  - “标签”是指后面跟一个冒号的标识符号，例如：label：
  - 对java来说唯一用到标签的地方是在循环语句之前。而在循环之前设置标签的唯一理由是：我们希望在其中镶嵌另一个循环，由于break和continue关键字通常只中断当前循环，但若随同标签使用，他们就会中断道存在标签的地方。 

  



