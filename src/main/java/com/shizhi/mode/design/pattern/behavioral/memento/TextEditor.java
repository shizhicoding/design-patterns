package com.shizhi.mode.design.pattern.behavioral.memento;

import lombok.Getter;

@Getter
public class TextEditor {
    private String text;

    public void write(String newText) {
        this.text = newText;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento){
        if (memento!=null){
            this.text=memento.getSavedText();
        }
    }
}
