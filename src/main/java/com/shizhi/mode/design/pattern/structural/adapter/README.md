# 适配器模式（Adapter）

将一个类的接口转换成客户端期望的另一个接口，使原本不兼容的类可以协同工作。

## Spring 中的应用

Spring MVC 的 `HandlerAdapter` 是经典的适配器模式。`DispatcherServlet` 通过 `HandlerMapping` 找到处理器后，并不直接调用它（因为处理器类型多种多样——`Controller`、`HttpRequestHandler`、`@RequestMapping` 方法等），而是通过 `HandlerAdapter` 将不同类型的处理器适配为统一的 `ModelAndView` 返回。

## 本示例

模拟多支付渠道统一的场景。`AliPay` 和 `WechatPay` 是两个第三方支付 API，它们的方法签名各不相同：

| 第三方 | 方法签名 |
|--------|---------|
| `AliPay` | `aliPay(String tradeNo, BigDecimal totalAmount)` |
| `WechatPay` | `wechatPay(String orderNo, BigDecimal money)` |

通过 `AliPaymentAdapter` 和 `WechatPaymentAdapter` 将它们都适配为统一的 `PaymentService` 接口：

```java
// 两个适配器对外接口完全一致
String result1 = aliPayAdapter.pay("ORDER_001", new BigDecimal("88"));
String result2 = wechatPayAdapter.pay("ORDER_002", new BigDecimal("188"));
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Target（目标接口） | `PaymentService` |
| Adaptee（被适配者） | `AliPay`、`WechatPay` |
| Adapter（适配器） | `AliPaymentAdapter`、`WechatPaymentAdapter` |
