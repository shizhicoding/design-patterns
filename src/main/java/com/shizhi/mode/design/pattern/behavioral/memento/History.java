package com.shizhi.mode.design.pattern.behavioral.memento;


import java.util.Stack;

//管理者：用于撤销操作但不改变其内容
public class History {
    private final Stack<TextMemento> stack=new Stack<>();

    public void push(TextMemento textMemento){
        stack.push(textMemento);
    }
    public TextMemento pop() {
        return stack.isEmpty() ? null : stack.pop();
    }
}
