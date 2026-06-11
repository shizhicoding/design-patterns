package com.shizhi.mode.design.pattern.behavioral.command.lifecommand;

import com.shizhi.mode.design.pattern.behavioral.command.AirConditioner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

//空调命令
@Component
@RequiredArgsConstructor
public class AirConditionerOnCommand implements Command{

    private final AirConditioner airConditioner;

    @Override
    public void execute() {
        airConditioner.on();
    }
}
