# 策略模式（Strategy）

定义一系列算法，把它们一个个封装起来，并使它们可以相互替换。策略模式让算法的变化独立于使用它的客户端。

## Spring 中的应用

`PlatformTransactionManager` 是策略模式的经典应用。Spring 为不同的事务管理方式提供了不同策略实现：`DataSourceTransactionManager`（JDBC）、`HibernateTransactionManager`（Hibernate）、`JtaTransactionManager`（分布式事务 JTA）。上层代码只需面向 `PlatformTransactionManager` 接口编程，Spring 会根据配置自动注入匹配的实现。

此外，`Resource` 接口的不同实现（`ClassPathResource`、`FileSystemResource`、`UrlResource`）也是策略模式的体现。

## 本示例

模拟电商订单打折策略。不同的折扣算法可以灵活替换，不影响 `Order` 的核心逻辑：

```java
// 原价订单
Order order1 = new Order(100, new NoDiscount());
order1.getFinalPrice(); // 100.0

// 8折订单
Order order2 = new Order(100, new PercentageDiscount(20));
order2.getFinalPrice(); // 80.0
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Strategy（策略接口） | `DiscountStrategy` |
| ConcreteStrategy（具体策略） | `NoDiscount`、`PercentageDiscount` |
| Context（上下文） | `Order` |
