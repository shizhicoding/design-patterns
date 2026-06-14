# 模板方法模式（Template Method）

在一个方法中定义算法的骨架，将某些步骤延迟到子类实现。模板方法使子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。

## Spring 中的应用

- **`JdbcTemplate`**：`query()`、`update()` 等方法定义了数据库操作的标准流程（获取连接 → 创建语句 → 执行 → 处理结果集 → 释放连接），具体 SQL 和结果映射由回调接口实现。
- **`AbstractApplicationContext.refresh()`**：定义了 Spring 容器启动的 13 步标准流程，其中 `postProcessBeanFactory()`、`onRefresh()` 等步骤留给子类扩展，这是典型的模板方法模式。

## 本示例

模拟通知发送系统。`send()` 方法是 `final` 的，定义了发送通知的固定流程，子类只需实现消息构建和发送的具体细节：

```java
// final 方法定义算法骨架，子类不可重写
public final void send(String recipient, String content) {
    validate(recipient);           // 通用校验
    String finalMessage = buildMessage(content);  // 子类实现
    doSend(recipient, finalMessage);   // 子类实现
    logSendResult(recipient, finalMessage);  // 钩子方法，可选覆盖
}
```

`EmailNotification` 发送邮件通知，`SmsNotification` 发送短信通知并额外覆写了日志记录方式。

**角色对应：**

| 角色 | 类 |
|------|-----|
| AbstractClass（抽象模板） | `NotificationSender` |
| ConcreteClass（具体实现） | `EmailNotification`、`SmsNotification` |
