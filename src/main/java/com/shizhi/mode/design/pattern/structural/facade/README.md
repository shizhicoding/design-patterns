# 外观模式（Facade）

为子系统中的一组接口提供一个统一的高层接口，使子系统更容易使用。外观模式通过封装复杂交互来降低客户端的调用难度。

## Spring 中的应用

Spring 的 `JdbcTemplate` 是外观模式的经典体现。它封装了 JDBC 繁琐的操作（获取连接、创建 Statement、处理 ResultSet、释放资源、异常转换等），对外提供简洁的 `query()`、`update()`、`execute()` 等方法。`RestTemplate`（已废弃，由 `WebClient` 替代）同样是 HTTP 调用的外观封装。

## 本示例

模拟家庭影院系统。`Screen`、`Projector`、`DvdPlayer` 三个子系统各有一系列操作步骤，`HomeTheaterFacade` 将它们封装成两个简单方法：

```java
// 客户端只需一行代码即可完成观影准备
homeTheaterFacade.watchMovie("星际穿越");
// 内部自动执行: 屏幕下降 → 投影仪开机 → 设置输入 → DVD开机 → 播放

homeTheaterFacade.endMovie();
// 内部自动执行: 屏幕上升 → 投影仪关机 → DVD关机
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Facade（外观类） | `HomeTheaterFacade` |
| Subsystem（子系统） | `Screen`、`Projector`、`DvdPlayer` |
