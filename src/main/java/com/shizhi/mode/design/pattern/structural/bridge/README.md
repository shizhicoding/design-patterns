# 桥接模式（Bridge）

将抽象部分与实现部分分离，使它们可以独立地变化。它用组合关系代替继承关系，从而降低抽象和实现两个维度的耦合。

## Spring 中的应用

Spring 的 `DataSource` 体系是典型的桥接模式。抽象层是 `DataSource` 接口（获取连接），实现层则有 `HikariDataSource`、`DruidDataSource`、`SimpleDriverDataSource` 等各种数据源实现。驱动管理（`DriverManager`）作为另一个维度的实现，与数据源独立变化，通过桥接方式组合。

## 本示例

模拟消息发送系统，存在两个独立变化的维度：

- **消息类型维度**：普通消息（`NormalMessage`）、加急消息（`UrgentMessage`）
- **发送渠道维度**：邮件发送（`EmailSender`）、短信发送（`SmsSender`）

通过组合的方式，可以自由搭配：

```java
// 加急消息 + 短信发送
Message msg1 = new UrgentMessage(new SmsSender());
msg1.sendMessage("bug 修复通知");

// 普通消息 + 邮件发送
Message msg2 = new NormalMessage(new EmailSender());
msg2.sendMessage("周报发送");
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Abstraction（抽象） | `Message` |
| RefinedAbstraction（细化抽象） | `NormalMessage`、`UrgentMessage` |
| Implementor（实现者接口） | `MessageSender` |
| ConcreteImplementor（具体实现） | `EmailSender`、`SmsSender` |
