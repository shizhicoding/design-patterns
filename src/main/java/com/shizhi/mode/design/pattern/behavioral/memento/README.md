# 备忘录模式（Memento）

在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便之后能将该对象恢复到原先保存的状态。

## Spring 中的应用

Spring 中备忘录模式较少直接出现，但 Spring State Machine 中的状态持久化机制（`StateMachinePersister`）使用了类似思想——在状态机之外保存和恢复状态。此外，Spring Web Flow 的快照（Snapshot）机制也是备忘录模式的体现。

## 本示例

模拟文本编辑器的撤销功能。`TextEditor` 负责创建和恢复备忘录，`History` 负责管理备忘录历史：

```java
TextEditor editor = new TextEditor();
History history = new History();

editor.write("版本1");
history.push(editor.save());   // 保存快照

editor.write("版本2");
history.push(editor.save());   // 保存快照

editor.write("版本3");

// 撤销操作
editor.restore(history.pop());  // 回到"版本2"
editor.restore(history.pop());  // 回到"版本1"
```

**角色对应：**

| 角色 | 类 |
|------|-----|
| Originator（发起人） | `TextEditor` |
| Memento（备忘录） | `TextMemento` |
| Caretaker（管理者） | `History` |
