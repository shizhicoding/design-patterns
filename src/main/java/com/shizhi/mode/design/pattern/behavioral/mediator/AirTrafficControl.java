package com.shizhi.mode.design.pattern.behavioral.mediator;

import com.shizhi.mode.design.pattern.behavioral.mediator.plane.Plane;

//中介者接口
public interface AirTrafficControl {

    void registerPlane(Plane plane);

    void sendMessage(String message, Plane sender);
}
