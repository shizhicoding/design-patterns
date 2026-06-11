package com.shizhi.mode.design.pattern.behavioral.memento;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MementoTest {

    @Test
    public void test(){
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello");
        history.push(editor.save());

        editor.write("Hello, World");
        history.push(editor.save());

        editor.write("Hello, World!");
        System.out.println("当前内容: " + editor.getText());

        editor.restore(history.pop());
        System.out.println("撤销一次后: " + editor.getText());

        editor.restore(history.pop());
        System.out.println("再撤销一次后: " + editor.getText());
    }
}
