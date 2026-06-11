package com.shizhi.mode.design.pattern.behavioral.state;

//具体状态：连接状态
public class ConnectedState implements ConnectionState{
    @Override
    public void connect(MobileConnection conn) {
        System.out.println("已经处于连接状态");
    }

    @Override
    public void disconnect(MobileConnection conn) {
        System.out.println("正在断开连接...");
        conn.setState(new DisconnectedState());
    }

    @Override
    public void sendData(MobileConnection conn, String data) {
        System.out.println("发送数据: " + data + " (成功)");
    }

    @Override
    public String getStateName() {
        return "已连接";
    }
}
