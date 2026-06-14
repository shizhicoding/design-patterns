# 状态模式（State）

允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。状态模式将与特定状态相关的行为封装在独立的状态类中，将状态转换逻辑分布到各个具体状态类中。

## Spring 中的应用

- **Bean 生命周期状态管理**：Spring Bean 在创建过程中经历多个状态阶段（实例化 → 属性填充 → 初始化 → 就绪 → 销毁），每个阶段的行为不同，类似于状态模式的体现。
- **Spring State Machine**：Spring 提供了完整的状态机框架（`spring-statemachine`），支持状态、事件、转换、守卫等概念，是状态模式的工程级实现。

## 本示例

模拟手机网络连接状态切换。`MobileConnection` 的行为取决于当前连接状态：

```java
MobileConnection connection = new MobileConnection();
// 初始状态：DisconnectedState

connection.sendData("hello");  // 未连接，数据发送失败
connection.connect();          // 切换到 ConnectedState
connection.sendData("hello");  // 数据发送成功
connection.disconnect();       // 切换回 DisconnectedState
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| State（状态接口） | `ConnectionState` |
| ConcreteState（具体状态） | `ConnectedState`、`DisconnectedState` |
| Context（上下文） | `MobileConnection` |
