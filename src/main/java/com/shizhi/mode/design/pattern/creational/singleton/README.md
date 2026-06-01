# 单例模式（Singleton）

确保一个类只有一个实例，并提供全局访问点。

## Spring 中的应用

Spring 容器中的 Bean 默认就是单例。`DefaultSingletonBeanRegistry` 使用 `ConcurrentHashMap`（一级缓存）存储所有单例 Bean，保证每个 Bean 定义在容器中只有一个实例。

Spring 3.x 还引入了三级缓存（`singletonObjects`、`earlySingletonObjects`、`singletonFactories`）来解决循环依赖问题。

## 本示例

`SingletonService` 是一个普通的 Spring `@Service`，默认作用域为 singleton。测试中连续多次 `getBean()` 获取的 cont 值是递增的，证明获取到的是同一个实例。
