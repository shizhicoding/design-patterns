package com.shizhi.mode.design.pattern.behavioral.state;

//状态接口
public interface ConnectionState {
    void connect(MobileConnection conn);
    void disconnect(MobileConnection conn);
    void sendData(MobileConnection conn, String data);
    String getStateName();
}
