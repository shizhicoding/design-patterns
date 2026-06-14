# 中介者模式（Mediator）

用一个中介对象封装一系列对象之间的交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，可以独立地改变它们之间的交互。

## Spring 中的应用

Spring MVC 的 `DispatcherServlet` 是中介者模式的典型体现。它作为前端控制器（中央中介），协调 `HandlerMapping`、`HandlerAdapter`、`ViewResolver` 等组件完成请求处理，各组件之间不直接通信，而是通过 `DispatcherServlet` 中转。

## 本示例

模拟机场塔台调度场景。飞机之间不直接通信，所有消息通过塔台（Tower）转发：

```java
AirTrafficControl tower = new Tower();

Plane passengerPlane1 = new PassengerPlane("客机001", tower);
Plane passengerPlane2 = new PassengerPlane("客机002", tower);
Plane cargoPlane = new CargoPlane("货机001", tower);

// 消息通过塔台广播给其他所有飞机
passengerPlane1.send("请求降落"); // 客机002和货机001收到消息
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Mediator（中介者接口） | `AirTrafficControl` |
| ConcreteMediator（具体中介者） | `Tower` |
| Colleague（同事类） | `Plane`（抽象） |
| ConcreteColleague（具体同事） | `PassengerPlane`、`CargoPlane` |
