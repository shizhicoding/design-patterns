# 命令模式（Command）

将请求封装为对象，使得可以用不同的请求参数化客户端、将请求排队或记录日志，以及支持可撤销操作。核心是将"调用者"与"执行者"解耦。

## Spring 中的应用

`JdbcTemplate` 中大量使用命令模式的变体——回调模式。例如 `JdbcTemplate.execute(ConnectionCallback)`、`JdbcTemplate.query(PreparedStatementCreator, ResultSetExtractor)` 等，将数据库操作封装为回调对象传递给模板方法执行，调用者无需关心连接的获取与释放。

## 本示例

模拟智能家居遥控器场景。遥控器（Invoker）不直接操作电器，而是通过命令对象间接调用：

```java
// 遥控器与具体电器解耦
RemoteControl lightRemote = new RemoteControl(lightOnCommand);    // 灯遥控器
RemoteControl acRemote = new RemoteControl(airConditionerOnCommand); // 空调遥控器

lightRemote.pressButton(); // 点灯开启
acRemote.pressButton();    // 空调开启
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Command（命令接口） | `Command` |
| ConcreteCommand（具体命令） | `LightOnCommand`、`AirConditionerOnCommand` |
| Receiver（接收者） | `Light`、`AirConditioner` |
| Invoker（调用者） | `RemoteControl` |
