# 原型模式（Prototype）

用原型实例指定创建对象的种类，通过拷贝原型来创建新对象，而不是通过 new。

## Spring 中的应用

Bean 的 `scope="prototype"` 就是原型模式。每次调用 `getBean()` 时 Spring 容器都会创建一个新实例，而不是返回单例缓存中的对象。

在 `AbstractBeanDefinition` 中通过 `SCOPE_PROTOTYPE` 常量标识，Spring 2.x 和 3.x 逻辑一致，3.x 配置方式更偏爱 `@Scope("prototype")` 注解。

## 本示例

`PrototypeService` 使用 `@Scope("prototype")` 标注。测试中连续多次 `getBean()` 获取到的都是新实例，每次 cont 都从 1 开始递增到 2，证明每次都是独立的新对象——与 SingletonService 的表现完全不同。
