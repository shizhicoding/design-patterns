# 23种设计模式 — Java & Spring 实战

用 Java 代码演示 GoF 23 种设计模式，结合 Spring Framework 源码分析每种模式的实际应用。

- **基础框架**：Spring Boot 3.5.14
- **JDK 版本**：Java 17
- **构建工具**：Maven

## 目录

### 创建型模式

| 模式 | Spring 中的应用 |
|------|----------------|
| [单例模式 (Singleton)](src/main/java/com/shizhi/mode/design/pattern/creational/singleton/README.md) | Bean 默认作用域、`DefaultSingletonBeanRegistry` |
| [工厂方法 (Factory Method)](src/main/java/com/shizhi/mode/design/pattern/creational/factorymethod/README.md) | `FactoryBean.getObject()` |
| [抽象工厂 (Abstract Factory)](src/main/java/com/shizhi/mode/design/pattern/creational/abstractfactory/README.md) | `BeanFactory` / `ApplicationContext` |
| [建造者 (Builder)](src/main/java/com/shizhi/mode/design/pattern/creational/builder/README.md) | `BeanDefinitionBuilder` |
| [原型 (Prototype)](src/main/java/com/shizhi/mode/design/pattern/creational/prototype/README.md) | `@Scope("prototype")` |

### 结构型模式

| 模式 | Spring 中的应用 |
|------|----------------|
| [适配器 (Adapter)](src/main/java/com/shizhi/mode/design/pattern/structural/adapter/README.md) | `HandlerAdapter` |
| [桥接 (Bridge)](src/main/java/com/shizhi/mode/design/pattern/structural/bridge/README.md) | `DataSource` 体系 |
| [组合 (Composite)](src/main/java/com/shizhi/mode/design/pattern/structural/composite/README.md) | `CompositeFilter` |
| [装饰器 (Decorator)](src/main/java/com/shizhi/mode/design/pattern/structural/decorator/README.md) | `ServerHttpRequestDecorator` |
| [外观 (Facade)](src/main/java/com/shizhi/mode/design/pattern/structural/facade/README.md) | `JdbcTemplate` / `RestTemplate` |
| [享元 (Flyweight)](src/main/java/com/shizhi/mode/design/pattern/structural/flyweight/README.md) | 单例 Bean 共享、方法缓存 |
| [代理 (Proxy)](src/main/java/com/shizhi/mode/design/pattern/structural/proxy/README.md) | AOP（JDK 动态代理 / CGLIB） |

### 行为型模式（待开发）

| 模式 | Spring 中的应用 |
|------|----------------|
| 责任链 (Chain of Resp.) | `HandlerInterceptor` 链 |
| 命令 (Command) | `JdbcTemplate` 的 `Callback` |
| 解释器 (Interpreter) | SpEL 表达式 |
| 迭代器 (Iterator) | 集合遍历 |
| 中介者 (Mediator) | `DispatcherServlet` |
| 备忘录 (Memento) | Spring 中较少见 |
| 观察者 (Observer) | `@EventListener` |
| 状态 (State) | Spring Statemachine、Bean Lifecycle |
| 策略 (Strategy) | `PlatformTransactionManager` |
| 模板方法 (Template Method) | `JdbcTemplate` / `refresh()` |
| 访问者 (Visitor) | `BeanDefinitionVisitor` / ASM |

