package com.shizhi.mode.design.pattern.behavioral.state;

//具体状态：断开状态
public class DisconnectedState implements ConnectionState{
    @Override
    public void connect(MobileConnection conn) {
        System.out.println("正在建立连接...");
        conn.setState(new ConnectedState());
    }

    @Override
    public void disconnect(MobileConnection conn) {
        System.out.println("已经处于断开状态，无需重复断开");
    }

    @Override
    public void sendData(MobileConnection conn, String data) {
        System.out.println("连接已断开，无法发送数据");
    }

    @Override
    public String getStateName() {
        return "断开连接";
    }
}
