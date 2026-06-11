package com.shizhi.mode.design.pattern.behavioral.mediator;

import com.shizhi.mode.design.pattern.behavioral.mediator.plane.CargoPlane;
import com.shizhi.mode.design.pattern.behavioral.mediator.plane.PassengerPlane;
import com.shizhi.mode.design.pattern.behavioral.mediator.plane.Plane;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MediatorTest {

    @Test
    public void test(){
        AirTrafficControl tower=new Tower();
        Plane plane1=new PassengerPlane("1",tower);
        Plane plane2=new CargoPlane("2",tower);
        Plane plane3=new PassengerPlane("3",tower);

        plane1.send("p1要起飞，请避让！");
        System.out.println("------------------------");
        plane2.send("p2要降落，请等待！");

    }
}
