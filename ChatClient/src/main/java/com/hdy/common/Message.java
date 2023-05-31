package com.hdy.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class Message implements Serializable {
    // 增强兼容性
    private static final long serialVersionUID = 1L;

    private String sender; // 发送者
    private String getter; // 接收者
    private String content;// 发送内容
    private String sendTime;// 发送时间
    private String messType;// 消息类型 (可在接口定义接口类型)
    // 4.0 新增 用于私聊 一个用户多个线程
    private String state;   // 用户状态(聊天的对象: 在线 群聊 某个人)

    /*  扩展
     *  和文件相关的 属性
     */
    private byte[] fileBytes;
    private int fileLen = 0;
    private String fileName;

    private String destPath;   // 文件传输存入的路径
    private String srcPath;    // 源文件路径

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}

