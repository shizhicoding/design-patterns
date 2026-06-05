# 组合模式（Composite）

将对象组合成树形结构以表示"部分-整体"的层次关系，使客户端可以一致地处理单个对象和组合对象。

## Spring 中的应用

Spring Security 的过滤器链中使用了组合模式。`CompositeFilter` 将多个 `Filter` 组合成一个，对外提供统一的 `doFilter()` 接口。客户端不需要关心内部有多少个过滤器，就能一致地对整个过滤器链进行处理。

## 本示例

模拟公司组织架构的树形结构，`Employee`（员工）是叶子节点，`Department`（部门）是容器节点，二者都继承 `OrganizationComponent`：

```java
Employee emp1 = new Employee("张三", 8000);
Employee emp2 = new Employee("李四", 12000);

Department devDept = new Department("开发部");
devDept.add(emp1);
devDept.add(emp2);

Department company = new Department("总公司");
company.add(devDept);

// 一致地统计人数和薪资，无需区分员工和部门
devDept.getCount();   // 2
company.getSalary();  // 20000.0
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Component（抽象构件） | `OrganizationComponent` |
| Leaf（叶子节点） | `Employee` |
| Composite（容器节点） | `Department` |
