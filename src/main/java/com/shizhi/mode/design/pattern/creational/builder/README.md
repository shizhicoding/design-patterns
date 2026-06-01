# 建造者模式（Builder）

将一个复杂对象的构建过程与它的表示分离，使得同样的构建过程可以创建不同的表示。

## Spring 中的应用

`BeanDefinitionBuilder` 是典型的建造者模式，通过 `addPropertyValue()`、`setScope()`、`setLazyInit()` 等方法逐步构建 `BeanDefinition`。

Spring 3.x 新增了 `WebClient.Builder`（响应式 HTTP 客户端构建器），Spring Boot 3.x 配套的 `SpringApplicationBuilder` 也是建造者。

## 本示例

`Order` 类使用 Lombok 的 `@Builder` 注解，可以通过链式调用按需设置字段：

```java
Order.builder()
    .orderId("1")
    .payType("微信")
    .totalAmount(100.0)
    .build();
```

只传想设的字段，其余自动忽略，灵活构建不同配置的订单对象。
