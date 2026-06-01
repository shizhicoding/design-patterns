package com.shizhi.mode.design.pattern.creational.factorymethod.factory;


import com.shizhi.mode.design.pattern.creational.factorymethod.PaymentService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//抽象工厂选择器
@Component
public class PaymentRouter {
    private  Map<String, PaymentService> paymentMap=new HashMap<>();

    public PaymentRouter(List<PaymentService> paymentServices){
        this.paymentMap = paymentServices.stream()
                .collect(Collectors.toMap(
                        s -> s.getClass().getSimpleName().replace("Service", "").toLowerCase(),
                        Function.identity()
                ));
    }

    public PaymentService get(String type){
        return paymentMap.get(type);
    }
}
