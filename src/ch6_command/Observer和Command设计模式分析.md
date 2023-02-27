# Observer和Command设计模式分析

## 1.联系

两者执行的流程大致相同，均为：

| Observer设计模式                      | Command设计模式                  |
| ------------------------------------- | -------------------------------- |
| 构造Observer，实现update()方法        | 构造Command，实现execute()方法   |
| 将Observer注册到Subject里面           | 将Command提交到调用者里面        |
| Subject发生变化                       | 调用者调用Command的时间到了      |
| Subject调用Observer的update()方法     | 调用者调用Command的execute()方法 |
| 根据Subject发生的变化执行update()方法 | 执行Command的execute()方法       |

## 2.区别

可以根据1.大致看出，两者的流程基本一样，但是具体分析有以下不同：

1. Observer订阅Subject的目的，是获取Subject的变化，其回调函数是需要根据Subject的变化来执行具体的行为的。这也说明Subject需要向Observer暴露自身改变的内容/通过update()方法的接口传给Observer。

   但是将Command提交到调用者中的目的，则是将调用者和接受者解耦。即调用者只需要面向Command编程即可，不需要了解Command具体影响了哪些接受者。所以execute()的参数也应该和调用者的变化无关。

2. Command模式更想表达的是接收者提供功能，让调用者根据调用的时机，选择不同的功能，解耦两种角色。

   而Observer模式更想表达的是Subject的变化驱动Observer的行为。

