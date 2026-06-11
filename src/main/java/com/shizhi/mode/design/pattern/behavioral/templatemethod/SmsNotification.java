package com.shizhi.mode.design.pattern.behavioral.templatemethod;

//具体子类：短信发送
public class SmsNotification extends NotificationSender{
    @Override
    protected String buildMessage(String content) {
        String finalMessage="短信通知"+content;
        System.out.println("[短信] 消息组装完成：" + finalMessage);
        return finalMessage;
    }

    @Override
    protected void doSend(String recipient, String message) {
        System.out.println("[短信] 正在发送至 " + recipient + " ...");
    }

    @Override
    protected void logSendResult(String recipient, String message) {
        System.out.println("[数据库日志] 推送记录已持久化，接收人：" + recipient);
    }
}
