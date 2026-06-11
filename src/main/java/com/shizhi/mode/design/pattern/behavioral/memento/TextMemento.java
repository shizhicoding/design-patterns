package com.shizhi.mode.design.pattern.behavioral.memento;

import lombok.RequiredArgsConstructor;

//备忘录：用于存储文本快照，对外封装细节
@RequiredArgsConstructor
public class TextMemento {
    private final String text;

    String getSavedText(){
        return text;
    }
}
