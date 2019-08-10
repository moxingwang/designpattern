# 观察者模式
> 定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。

- 设计原则
    - 松耦合

- 例子
    - 气象台发布气象数据
- jdk中的出现
    - swing

# 装饰者模式
> 动态地将责任附加到对象上。若要扩展功能，装饰着提供了比继承更有弹性的替代方案。

- 例子
    - 各种咖啡饮料不同价格的组合
- jdk中的出现
    - IO
    
# 简单工厂
> 简单工厂其实不是一个设计模式，反而比较像是一种编程习惯。
- 例子
    - 披萨制作（一个店铺制造披萨依赖多个工厂）
    
# factory method
> 定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
- 设计原则
    - 依赖倒置原则
    > 要依赖抽象，不要依赖具体类。不能让高层组件依赖底层组件，而且，不管是高层或者底层，“两者”都应该依赖于抽象。

- 例子
    - 披萨制作（多个店铺制造披萨）
    
# abstract factory
> 提供一个接口，用于创建相关或依赖对象的家族，而不是要明确具体类。
- 例子
    - 披萨制作（使用披萨原厂原料家族创建）
        
- jdk中的出现
    - 
    
# 单例模式
    
# 命令模式
> 将“请求”封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。 

- 例子
    - 遥控器

# 适配器模式
> 将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。

- 例子
    - 交流电适配器

# 外观模式
> 提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。

- 原则
    - 最少知道原则
    
    
# 模板方法模式
> 在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。

- 例子
    - 茶和咖啡的制作步骤 
    
# 策略模式

