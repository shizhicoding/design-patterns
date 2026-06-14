# 访问者模式（Visitor）

表示一个作用于某对象结构中各元素的操作。它使你在不改变各元素的类的前提下，定义作用于这些元素的新操作。

## Spring 中的应用

- **`BeanDefinitionVisitor`**：Spring 使用访问者模式遍历和修改 `BeanDefinition` 的属性值，支持对作用域、属性、构造参数等进行统一处理。
- **ASM 字节码框架**：Spring 内部使用 ASM 操作字节码，`ClassVisitor`、`MethodVisitor`、`FieldVisitor` 等都是典型的访问者模式实现。

## 本示例

模拟购物车促销场景。不同类型的商品（书、衣服）接受访问者（不同促销策略）的访问：

```java
PromotionVisitor discountPromotion = new DiscountPromotion(0.8);          // 8折
PromotionVisitor thresholdPromotion = new ThresholdDiscountPromotion(100, 20); // 满100减20

Book book = new Book("设计模式", 59.0);
Clothing clothing = new Clothing("T恤", 149.0, "L");

// 双重分派：accept 调用 visitor.visit(this)，根据元素类型分发到对应方法
book.accept(discountPromotion);
clothing.accept(discountPromotion);

System.out.println("总折扣金额：" + ((DiscountPromotion) discountPromotion).getTotalDiscount());
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Visitor（访问者接口） | `PromotionVisitor` |
| ConcreteVisitor（具体访问者） | `DiscountPromotion`、`ThresholdDiscountPromotion` |
| Element（元素接口） | `CartItem` |
| ConcreteElement（具体元素） | `Book`、`Clothing` |
