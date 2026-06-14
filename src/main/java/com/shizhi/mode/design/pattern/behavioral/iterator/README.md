# 迭代器模式（Iterator）

提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露该对象的内部表示。

## Spring 中的应用

Spring 中广泛使用迭代器模式。`CompositeIterator` 组合多个迭代器为统一的迭代器；各集合框架的遍历均基于迭代器模式。Spring 的 `PropertySource`、`Environment` 等也通过迭代方式遍历配置来源。

## 本示例

自定义两种任务列表的迭代器——底层分别使用数组和链表存储，但对外暴露统一的迭代接口：

```java
// 底层用数组存储
FixedTaskList fixedList = new FixedTaskList(3);
fixedList.addTask(new Task("设计数据库"));
fixedList.addTask(new Task("编写接口"));

// 底层用链表存储
FlexibleTaskList flexibleList = new FlexibleTaskList();
flexibleList.addTask(new Task("写单元测试"));

// 两种列表使用相同的遍历方式
TaskIterator iterator1 = fixedList.createIterator();
while (iterator1.hasNext()) {
    System.out.println(iterator1.next().getTitle());
}
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Iterator（迭代器接口） | `TaskIterator` |
| ConcreteIterator（具体迭代器） | `FixedTaskList.FixedIterator`、`FlexibleTaskList.FlexibleIterator` |
| Aggregate（聚合接口） | `TaskList` |
| ConcreteAggregate（具体聚合） | `FixedTaskList`、`FlexibleTaskList` |
