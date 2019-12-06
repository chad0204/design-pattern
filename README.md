# 一.策略模式-多用组合少用继承

1.找出应用中可能需要变化之处，并将他们独立出来，不要将他们和那些固定代码混合在一起
2.针对接口编程，而不是针对实现编程
3.多用组合，少用继承

继承解决了开发中的复用，组合解决了开发后的扩展。


策略模式：定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。


# 二.观察者模式

发布订阅

主题-观察者

推-拉
推是主题(可观察者)将变更参数通过update直接传给观察者。拉是主题(可观察者)不传参数(null)，而是将主题对象通过update传递给观察者，观察者通过主题对象的get方法主动拉取。

Java api 自动的观察者类的update方法提供了两个参数，一个是可观察者(主题)对象，用于给观察者自定义拉取数据；另一个是可观察者要推送的数据。


观察者模式：定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖着都会收到通知并自动更新。观察者可以通过推和拉两种方式获取主题数据。


# 三.装饰者模式-装饰对象

类应该对扩展开放，对修改关闭

装饰者模式，装饰类和被装饰类都实现相同的接口，装饰就是给被装饰增强一些功能。

装饰者模式：动态的将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案。

装饰者模式在Java IO中的使用，还有像Collections.SynchronizedCollection类就是一个包装类。


# 四.简单工厂、工厂方法模式、抽象工厂模式

(静态)简单工厂只是一种编码习惯，并不是设计模式。

工厂方法模式，一个抽象的工厂方法，将创建对象交给子类的具体工厂方法实现。

封装具体类型的实例化

工厂方法模式：定义了一个创建对象的接口，但由子类决定具体要实例化的对象是哪一个，工厂方法模式让类把实例化推迟到子类。

不用工厂，客户端类需要依赖的类就会很多，工厂方法将类的耦合度降到最低。

要依赖抽象，不要依赖具体类。不能让高层组件依赖底层组件，如商店类不需要依赖具体的商品类。


依赖倒置，就是java的动态绑定，客户端并不知道是什么实现类型，但依然可以定位实现方法。所以我们在设计客户端（披萨店）代码时，不需要考虑具体产品（披萨）的实现方式。


抽象工厂模式，提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指出具体类。

工厂方法模式就是提供一个抽象方法，子类实现该工厂方法，将客户端代码和具体产品实现解耦，抽象工厂将一组产品的创建封装成一个大接口，具体的产品创建通过组合这个工厂类来实现。抽象工厂模式用到了工厂方法模式。

抽象工厂使用组合，对象的创建交给一组工厂接口的方法，用来创建一组产品。工厂方法使用继承，把对象的创建委托给子类，子类实现工厂方法，用于创建专一产品。



# 五.单例模式

单例模式，确保一个类只有一个实例，并提供一个全局访问点。

把类定义成静态变量也可以实现单例，但这把类的初始化权利交给了Java，程序员就不能控制类实例化的时间，比如延迟初始化。

多个类加载器的情况下，会初始化多个实例，因为每个类加载器都有自己的命名空间。


# 六.命令模式-封装调用

发出请求的对象，接收和执行请求的对象接耦。

命令模式，将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也可支持撤销的操作。

命令模式将一组运算打包，可以在方法中传递。

应用，线程池(ThreadPoolExecutor#execute(Runnable command)),工作队列，任务队列。以及对请求进行日志持久化，宕机时可以通过请求日志恢复操作。

命令模式是三层封装（遥控器，命令，具体的工具）



# 七.适配器模式、外观模式

适配器实现目标接口，适配器持有被适配者的引用，客户对目标类的调用，会被是被器委托给被适配对象。

适配器模式，将一个类的接口，转换成客户期望的另一个接口，让原本不兼容的类可以合作。

jdk中的适配器，新的Collection为了兼容老的Collection，EnumerationIterator（适配器），Iterator 目标接口，Enumeration被适配接口。

适配器模式和装饰者模式的差异，适配器是转换接口，装饰者是添加新行为。

外观模式就是将一组类的的方法，组合到一个方法中。外观是简化接口，适配器是转换接口。

外观模式，提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，使多个子系统的访问变得简单。最少知识原则，让用户知道的类最少。



# 八.模版方法模式-封装算法

抽象父类提供模版方法，模版方法规定了一系列步骤方法。这些步骤中，相同逻辑的由抽象父类提供，不同的逻辑父类只提供抽象方法，具体的实现分别由子类实现。

模版方法模式，在一个方法中定义算法的骨架，而将一些步骤延迟到子类中实现。模版方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。

钩子方法（hook()），可以决定在算法中是否执行某步骤或者改变算法结构。通常钩子为默认实现或空实现，子类可以选择覆盖钩子，完成自己的目的。


工厂方法，由子类决定具体实例化哪个具体类；策略，封装可互换的行为，然后用委托来决定要采用哪个行为,行为是完整的；模版方法，子类决定如何实现算法中的步骤。

数组排序时，对象实现Comparable接口，重写compareTo()方法，是一种模版方法。sort()方法就是模版方法，sort()中的调用的compareTo()就是抽象步骤，这里借助Comparable来提供抽象的步骤（总不能让对象继承数组吧，所以compareTo方法由Comparable接口提供）。

父类的模版方法提供算法骨架（步骤实现不完整，父类未实现的一些步骤会委托给子类），子类提供算法中部分步骤的具体实现。即父类中的模版方法调用子类的步骤实现。其实工厂方法模式也是一种模版方法模式。

模版方法模式提供了一套代码复用的技巧。

策略模式也是封装算法，它用组合的方式，封装完整的算法，而模版方法只封装算法结构，使用子类具体实现算法中的某些步骤。


# 九.迭代器与组合模式

不同的集合，提供相同的迭代方式，隐藏了集合的具体实现方式。

迭代器模式，提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部实现。

jdk提供的迭代器接口，集合使用内部类实现迭代器并提供获取迭代器的方法。ArrayList还实现了ListIterator迭代器，这个迭代器提供了previous()方法，可以向前遍历。


jdk的集合使用的是内部迭代器，这样可以使集合的使用更加方便，但却违反的单一责任原则。就是将集合的管理和集合的迭代放在了一起，这样如果集合改变，那么遍历方式也会改变，使用单一责任原则，应该将迭代遍历委托给另一类，将元素管理和元素遍历分开。如果一个类或者模块只支持一个功能，那么称为具有高内聚，而jdk的集合属于低内聚。


组合模式，允许你将对象组合成树形结构来来表现“整体/部分”层次结构。组合能让客户以一致的方式来处理个别对象以及对象组合。

组合模式中的集合和元素都继承同一个类型，用户可以将对象集合和个别对象一视同仁。组合模式是一种违反单一责任原则的模式。



# 十.状态模式

对代码的修改关闭，对功能的扩展开发。

状态模式，允许对象在内部状态改变时改变它的行为，看起来就像是对象动态的改变了它的类。

状态模式和策略模式是双胞胎，它们都是将行为封装,通过组合行为对象，把类功能委托给行为对象处理。但是它们的区别在于使用意图，状态模式的使用者并不知道也不用知道对象目前的状态，状态会随着情况在状态集合（都被组合在一个类中）中游走。而策略模式的状态（行为）是使用者自己指定的。



# 十一.代理模式

RMI网络传输时，自定义的类需要实现Serializable序列化接口，原语类型（primitive类型，即基本类型）可以直接传输。字符串、包装类以及集合等API由于已经实现序列化接口，也可以直接传输。

远程代理对象。

代理模式，为另一个对象提供一个替身或者占位符以控制对这个对象的访问。

使用代理模式创建代理对象，让代理对象控制某对象的访问，被代理的对象可以是远程的对象、创建开销大的对象或者需要安全控制的对象。

远程代理，在不同jvm中运行的类，通过生成远程代理对象，通过网络远程调用。虚拟代理，创建开销大的对象，当对象在创建前或创建中时，由虚拟代理来扮演对象的替身，对象创建完成后，代理就会将请求直接委托给对象。动态代理，代理对象是jvm动态生成的,动态是指代理类是代码执行时才创建的。


代理模式和装饰者模式有点像，不过目的不同，装饰者是增加行为，代理是控制对象访问。代理模式和适配器模式也有点像，它们都挡在对象访问的前面，不过适配器是转换接口，代理是相同接口。

使用工厂模式创建代理包装主题，代理对客户就变得透明，客户根本不知道自己调用的是代理对象而不是真正的对象。



# 十二.其他模式

桥接模式Bridge
生成器模式Builder
责任链模式
蝇量模式
解释器模式
中介者模式
备忘录模式
原型模式
访问者模式


问题：
1.观察者的拉是怎么实现的？
2.mvc模型用到了哪些设计模式？
观察者、策略、适配器。


总结：
1.定义，设计模式是在某情境(context)下，针对某问题的某种解决方案。
2.分类，创建型(单例，抽象工厂，工厂方法)，行为型(模版方法，命令，状态，观察者，迭代器，策略)，结构型(装饰者，代理，组合)



todo








