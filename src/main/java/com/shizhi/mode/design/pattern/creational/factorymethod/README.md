# 工厂方法模式（Factory Method）

定义一个创建对象的接口，让子类决定实例化哪个类，将对象创建延迟到子类。

## Spring 中的应用

`FactoryBean<T>` 接口是标准的工厂方法模式实现：
- `getObject()` — 工厂方法，返回 Bean 实例
- `getObjectType()` — 返回产品类型

常见实现：`SqlSessionFactoryBean`（MyBatis）、`ProxyFactoryBean`（AOP）。

## 本示例

`PaymentService` 接口定义支付行为，`AlipayService` 和 `WechatService` 是具体实现。`PaymentRouter` 作为工厂，根据类型名称返回对应的支付服务实例。
