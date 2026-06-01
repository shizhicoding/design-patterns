package com.shizhi.mode.design.pattern.creational.abstractfactory.factory;

import com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method.Payment;
import com.shizhi.mode.design.pattern.creational.abstractfactory.pay.method.Refund;


//抽象工厂
public interface PayFactory {
   Payment getPayment();
   Refund getRefund();
}
