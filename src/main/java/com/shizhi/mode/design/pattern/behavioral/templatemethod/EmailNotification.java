package com.shizhi.mode.design.pattern.behavioral.templatemethod;

//具体子类：邮箱发送
public class EmailNotification extends NotificationSender{
    @Override
    protected String buildMessage(String content) {
        String finalMessage="邮件通知"+content;
        System.out.println("[邮件] 消息组装完成：" + finalMessage);
        return finalMessage;
    }

    @Override
    protected void doSend(String recipient, String message) {
        System.out.println("[邮件] 正在发送至 " + recipient + " ...");
    }
}
