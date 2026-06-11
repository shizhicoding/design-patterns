package com.shizhi.mode.design.pattern.behavioral.command.control;

import com.shizhi.mode.design.pattern.behavioral.command.lifecommand.Command;

//调用命令
public class RemoteControl {
    private Command command;

    public RemoteControl(Command command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
    }
}
