package com.shizhi.mode.design.pattern.behavioral.state;

import lombok.Setter;



//手机连接对象
public class MobileConnection {
    @Setter
    private ConnectionState state;

    public MobileConnection(){
        state=new DisconnectedState();
    }

    public void connect() {
        state.connect(this);
    }

    public void disconnect() {
        state.disconnect(this);
    }

    public void sendData(String data) {
        state.sendData(this, data);
    }

    public void showStatus() {
        System.out.println("当前状态：" + state.getStateName());
    }
}
