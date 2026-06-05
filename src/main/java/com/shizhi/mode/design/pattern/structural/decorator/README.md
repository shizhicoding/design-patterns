# 装饰器模式（Decorator）

动态地给对象添加额外的职责，比生成子类更灵活。装饰器和被装饰对象实现相同的接口，在外层包装内层对象。

## Spring 中的应用

Spring 的 `ServerHttpRequestDecorator` 是装饰器模式的典型应用。它包装标准的 `ServerHttpRequest`，可以在不修改原始请求对象的前提下，增加对请求体缓存、修改请求头等功能。Spring Cloud Gateway 的 `GatewayFilter` 也是基于类似的装饰思想。

## 本示例

以咖啡店点单为场景。`SimpleCoffee` 是基础咖啡，通过 `MilkDecorator` 和 `SugarDecorator` 动态添加配料：

```java
Coffee coffee = new SimpleCoffee();
// 普通咖啡 价格：5.9

coffee = new MilkDecorator(coffee);
// 普通咖啡+牛奶 价格：7.9

coffee = new SugarDecorator(coffee);
// 普通咖啡+牛奶+糖 价格：8.9

// 也可以一次性嵌套组合
Coffee myCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
// 普通咖啡+牛奶+糖 价格：8.9
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Component（抽象构件） | `Coffee` |
| ConcreteComponent（具体构件） | `SimpleCoffee` |
| Decorator（抽象装饰器） | `CoffeeDecorator` |
| ConcreteDecorator（具体装饰器） | `MilkDecorator`、`SugarDecorator` |
