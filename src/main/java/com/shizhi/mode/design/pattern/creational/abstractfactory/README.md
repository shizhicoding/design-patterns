# 抽象工厂模式（Abstract Factory）

提供一个创建一系列相关或相互依赖对象的接口，无需指定具体类。

## Spring 中的应用

`BeanFactory` 就是抽象工厂，定义了一组 `getBean()` 方法。`DefaultListableBeanFactory`、`XmlBeanFactory`（2.x）、`AnnotationConfigApplicationContext` 等是具体工厂，各自生产整套 Bean 实例。

## 本示例

`PayFactory` 接口定义了两个产品：`getPayment()` 和 `getRefund()`。`PayChannelSelector` 根据渠道类型（ali/wx），返回对应的支付+退款产品族：

- **ali** → `AliPayment` + `AliRefund`
- **wx** → `WxPayment` + `WxRefund`

这样可以保证同一个渠道的支付和退款是配套的。
