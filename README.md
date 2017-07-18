各个模式适用场景说明
===
软件开发当中基本上每项技术和概念都有其要解决的问题，有其适用的场景，同样，每种设计模式也有其要解决的问题，有其产生原因，技术更多的都是脱胎于需求，解决现实问题。  
设计模式大体分为三大类：  
创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。  
结构型模式，共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。  
行为型模式，共十一种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。  
其他模式：并发型模式和线程池模式。  
遵循六大原则：  
1）单一职责原则  （Single Responsibility Principle）
2）里氏替换原则（Liskov Substitution Principle）  
3）依赖倒转原则（Dependence Inversion Principle）  
4）接口隔离原则（Interface Segregation Principle）  
5）迪米特法则（最少知道原则）（Demeter Principle）  
6）合成复用原则（Composite Reuse Principle）  

工厂模式
-----
工厂模式是随着产品树的不断庞大而产生的类似分类管理类目的模型。  
1）简单工厂模型是指产品树较少的情况下，类似于一个简单的“人工作坊”只生产几类商品，我们需要根据需求（参数）来“生产”某个商品，产生该商品的参数信息等。  
2）当一个工厂规模不断扩大，生产商品种类不断繁多，在软件开发时，简单工厂模式这种单一种类管理一旦涉及改动会可能导致整个类目出现问题，为了尽量影响小，同时方便管理和查找，我们需要对这些商品进行分类，工厂方法模板适用场景大概既此。  
3）当多个工厂生产商品，而商品之间又有彼此的关联关系，那么我们就需要一种新的模型来管理这些关联关系，于是就产生了抽象工厂模型。  
***
* 简单工厂模式(Simple Factory Pattern)

简单工厂模式又称静态工厂方法(static factory method)，用来管理少量“商品”的情况。
***

* 工厂方法模式(Factory Method Pattern)


工厂方法模式根据不同商品类目来管理商品，“生产”不同商品时候我们只需要调用该类目的工厂方法即可。
***

* 抽象工厂模式(Abstract Factory Pattern)

抽象工厂模式用来管理多个工厂多个类目商品之间的关联关系，客户只需调用“抽象工厂”，即可生产出两个工厂生产的产品的组合产品，而不用关心具体的工厂是哪个。
***

单例模式
-----
单例模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。这个类称为单例类。
***
* 饿汉式

饿汉式是空间换时间，当类装载的时候就会创建类的实例，不管是否使用，先创建出来，然后每次调用的时候，就不需要判断是否创建，节省了运行时间。
***
* 懒汉式

懒汉式相反，是时间换取空间，就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间，如果一直没有人使用的话，那就不会创建实例，则节约内存空间。
***

建造模式
-----
建造模式是指对某个产品（对象）按照指定规格进行创建生产（初始化），对某个产品（对象）进行操作的类就称为建造者。
***
* 建造模式(Builder Pattern)

需要使用建造模式的情况：

1)需要生产的产品对象有复杂的内部结构。

2)需要生产的产品对象的属性相互依赖。
***

原型模式
-----
刚接触java时候总是觉着设计模式似乎很高大上，但实际上JAVA设计模式和算法一样，其实就是我们开发中遇到问题的总结，然后给这些总结起了个名字。开发经验丰富之后再看一下设计模式的书，便会恍然大悟：原来我一直用的东西叫这个名字。这个原型模式便是典型的这种总结，它甚至称不上模式，只是Cloneable接口的用法。
***
* 浅复制

在调用clone方法时候，对值类型的成员变量进行值的复制，,对引用类型的成员变量只复制引用,不复制引用的对象。即按值传递的数据（比如基本数据类型、String类型）复制，而不复制它所引用的对象的值，换言之，所有的对其他对象的引用都仍然指向原来的对象。
***
* 深复制

对值类型的成员变量进行值的复制,对引用类型的成员变量也进行引用对象的复制，这就需要引用类型的成员类也要重写Cloneable接口。
***
