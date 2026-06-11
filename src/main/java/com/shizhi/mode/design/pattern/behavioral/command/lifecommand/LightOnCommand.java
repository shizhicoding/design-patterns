package com.shizhi.mode.design.pattern.behavioral.command.lifecommand;


import com.shizhi.mode.design.pattern.behavioral.command.Light;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

//灯命令
@Component
@RequiredArgsConstructor
public class LightOnCommand implements Command{
    private final Light light;

    @Override
    public void execute() {
        light.on();
    }
}
