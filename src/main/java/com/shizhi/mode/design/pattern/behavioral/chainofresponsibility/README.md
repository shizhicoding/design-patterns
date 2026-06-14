# 责任链模式（Chain of Responsibility）

将请求的发送者和接收者解耦，使多个接收者都有机会处理请求。将这些接收者连成一条链，请求沿着链传递直到被处理。

## Spring 中的应用

Spring MVC 的拦截器链（`HandlerInterceptor`）是典型应用。`DispatcherServlet` 将多个 `HandlerInterceptor` 组成一条链，请求依次经过 `preHandle` → Controller → `postHandle` → `afterCompletion`，任一拦截器返回 `false` 则终止链条。

## 本示例

模拟请假审批流程，不同级别领导拥有不同的审批权限：

| 审批人 | 权限范围 |
|--------|---------|
| 组长（GroupLeader） | ≤ 1 天 |
| 经理（Manager） | ≤ 3 天 |
| 总监（Director） | ≤ 7 天 |

超过 7 天的请假申请，链条走到尽头后被直接驳回。

```java
// 构建责任链
Approver groupLeader = new GroupLeader("张三");
Approver manager = new Manager("李四");
Approver director = new Director("王五");
groupLeader.setNextApprover(manager);
manager.setNextApprover(director);

// 请求沿链传递
groupLeader.approve(5);  // 组长转经理，经理转总监，总监审批通过
groupLeader.approve(10); // 链上无人可批，申请驳回
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Handler（抽象处理者） | `Approver` |
| ConcreteHandler（具体处理者） | `GroupLeader`、`Manager`、`Director` |
