package com.shizhi.mode.design.pattern.behavioral.templatemethod;

//抽象父类：定义骨架
public abstract class NotificationSender {
    //定义模版方法
    public final void send(String recipient,String content){
        validate(recipient);
        String finalMessage=buildMessage(content);
        doSend(recipient,finalMessage);
        logSendResult(recipient,finalMessage);
    }

    private void validate(String recipient){
        if (recipient==null||recipient.isEmpty()){
            throw new IllegalArgumentException("接收人不能为空");
        }
        System.out.println("[通用校验] 接收人：" + recipient);
    }

    protected abstract String buildMessage(String content);
    protected  abstract void  doSend(String recipient,String message);

    protected void logSendResult(String recipient,String message){
        System.out.println("[日志] 通知已发送至 " + recipient + "，内容：" + message);
    }
}
