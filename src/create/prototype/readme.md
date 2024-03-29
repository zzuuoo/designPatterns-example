## 原型模式
### 定义
+ 原型模式是创建型模式的一种，其特点在于通过“复制”一个已经存在的实例来返回新的实例,而不是新建实例。被复制的实例就是我们所称的“原型”，这个原型是可定制的。
  
+ 原型模式多用于创建复杂的或者耗时的实例，因为这种情况下，复制一个已经存在的实例使程序运行更高效；或者创建值相等，只是命名不一样的同类数据

### 优点
   ● 性能优良
   
   + 原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，特别是要在一个循环体内产生大量的对象时，原型模式可以更好地体现其优点。
   
   ● 逃避构造函数的约束
   
   + 这既是它的优点也是缺点，直接在内存中拷贝，构造函数是不会执行的（参见13.4节）。优点就是减少了约束，缺点也是减少了约束，需要大家在实际应用时考虑。 

  
###动机
+ 在软件系统中，经常面临者"某些结构复杂的对象"的创建工作；由于需求的变化，这些对象经常面临者剧烈的变化，但是它们却拥有比较稳定一致的接口。
+ 如何应对这种变化？如何向"客户程序"隔离出"这些易变的对象"，从而使得"依赖这些易变对象的客户程序"不随着需求改变而改变"？
