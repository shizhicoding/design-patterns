# 代理模式（Proxy）

为另一个对象提供替身或占位符，以控制对这个对象的访问。代理对象与真实对象实现相同的接口，客户端通过代理间接访问真实对象。

## Spring 中的应用

Spring AOP 是代理模式的最典型应用。Spring 根据目标类是否实现接口，自动选择 JDK 动态代理或 CGLIB 代理，在方法调用前后织入横切逻辑（事务管理、日志、权限校验等），而调用方对此完全无感知。

## 本示例

模拟图片加载场景，通过 `ProxyImage` 实现延迟加载（Lazy Initialization）：

```java
// 构造代理时不会加载图片（节省内存）
Image image1 = new ProxyImage("photo1.jpg");

// 第一次调用 display() 时才真正加载
image1.display();
// 输出: 从硬盘加载图片：photo1.jpg
//       显示图片：photo1.jpg

// 第二次调用直接使用已加载的对象，不会再从硬盘加载
image1.display();
// 输出: 显示图片：photo1.jpg
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Subject（抽象主题） | `Image` |
| RealSubject（真实主题） | `RealImage` |
| Proxy（代理） | `ProxyImage` |
