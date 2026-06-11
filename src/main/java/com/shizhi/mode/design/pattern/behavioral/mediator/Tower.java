package com.shizhi.mode.design.pattern.behavioral.mediator;

import com.shizhi.mode.design.pattern.behavioral.mediator.plane.Plane;

import java.util.ArrayList;
import java.util.List;


//具体中介
public class Tower implements AirTrafficControl{

    private final List<Plane> planeList=new ArrayList<>();
    @Override
    public void registerPlane(Plane plane) {
        planeList.add(plane);
    }

    @Override
    public void sendMessage(String message, Plane sender) {
        for (Plane plane : planeList) {
            if (plane!=sender){
                plane.receiveMessage(message);
            }
        }
    }
}
