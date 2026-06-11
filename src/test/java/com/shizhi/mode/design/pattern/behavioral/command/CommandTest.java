package com.shizhi.mode.design.pattern.behavioral.command;

import com.shizhi.mode.design.pattern.behavioral.command.control.RemoteControl;
import com.shizhi.mode.design.pattern.behavioral.command.lifecommand.AirConditionerOnCommand;
import com.shizhi.mode.design.pattern.behavioral.command.lifecommand.LightOnCommand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommandTest {

    @Autowired
    private LightOnCommand lightOnCommand;

    @Autowired
    private AirConditionerOnCommand airConditionerOnCommand;

    @Test
    public void test(){
        RemoteControl remoteControl1=new RemoteControl(lightOnCommand);
        remoteControl1.pressButton();

        RemoteControl remoteControl2=new RemoteControl(airConditionerOnCommand);
        remoteControl2.pressButton();
    }
}
