# 观察者模式（Observer）

定义对象间一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并自动更新。

## Spring 中的应用

Spring 基于 `ApplicationEvent` 和 `@EventListener` 注解提供了完整的事件发布-订阅机制。`ApplicationEventPublisher` 充当主题（Subject）角色，使用 `@EventListener` 或实现 `ApplicationListener` 的方法充当观察者。Spring 内置了大量事件，如 `ContextRefreshedEvent`、`RequestHandledEvent` 等，开发者也可以自定义事件。

## 本示例

模拟股票价格监控系统。当股票价格变动时，自动通知投资者和记录日志：

```java
// 发布事件（主题方）
stockService.updateStockPrice("深度求索有限公司", 150.0, 152.5);

// 观察者方自动响应
// @EventListener 方法监听 StockPriceChangedEvent：
//   方法1: 发送短信通知投资者
//   方法2: 记录价格变动日志
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Subject（主题/发布者） | `StockService` + `ApplicationEventPublisher` |
| Observer（观察者/订阅者） | `StockListeners` |
| Event（事件对象） | `StockPriceChangedEvent` |
