# 享元模式（Flyweight）

通过共享技术有效地支持大量细粒度对象。将对象的状态分为内部状态（可共享）和外部状态（不可共享），通过共享内部状态来减少内存占用。

## Spring 中的应用

Spring 的单例 Bean 本质上就是享元模式的体现——所有调用者共享同一个 Bean 实例，避免了重复创建对象的开销。此外，Spring 的方法级别缓存（`@Cacheable`）也体现了享元思想：相同参数的调用结果被缓存并共享。

## 本示例

通过 JDK 内置的字符串常量池技术演示享元模式——这也是 Java 语言层面最经典的享元实现：

```java
String s1 = "hello";
String s2 = "hello";     // 复用常量池中的 "hello"
String s3 = new String("hello");  // 在堆上新创建对象

System.out.println(s1 == s2);  // true  —— 共享同一对象
System.out.println(s1 == s3);  // false —— 不同的对象
System.out.println(s1 == s3.intern());  // true —— intern()返回常量池引用
```

JDK 的 `String.intern()` 维护了一个字符串常量池，相同内容的字符串字面量共享同一个对象，这正是享元模式中"共享内部状态"的核心思想。

> 注：享元模式没有独立的 main 业务代码，直接通过 `Demo` 类中的 `main` 方法演示。
