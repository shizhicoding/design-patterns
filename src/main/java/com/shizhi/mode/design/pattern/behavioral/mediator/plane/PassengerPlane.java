package com.shizhi.mode.design.pattern.behavioral.mediator.plane;

import com.shizhi.mode.design.pattern.behavioral.mediator.AirTrafficControl;

//具体同事类：客机
public class PassengerPlane extends Plane{
    public PassengerPlane(String name, AirTrafficControl airTrafficControl) {
        super(name, airTrafficControl);
    }

    @Override
    public void send(String message) {
        System.out.println("【客机" + name + "】发送消息：" + message);
        airTrafficControl.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("【客机" + name + "】收到消息：" + message);
    }
}
