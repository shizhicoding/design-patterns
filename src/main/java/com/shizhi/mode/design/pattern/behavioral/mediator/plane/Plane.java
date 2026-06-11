package com.shizhi.mode.design.pattern.behavioral.mediator.plane;

import com.shizhi.mode.design.pattern.behavioral.command.AirConditioner;
import com.shizhi.mode.design.pattern.behavioral.mediator.AirTrafficControl;

//抽象同事类：飞机
public abstract class Plane {

    protected String name;
    protected AirTrafficControl airTrafficControl;

    public Plane(String name,AirTrafficControl airTrafficControl){
        this.name=name;
        this.airTrafficControl=airTrafficControl;
        airTrafficControl.registerPlane(this);
    }

    public abstract void send(String message);

    public abstract void receiveMessage(String message);
}
