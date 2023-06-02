package com.hdy.common;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
@Data
public class User implements Serializable {
    // 增强兼容性
    @Serial
    private static final long serialVersionUID = 1L;
    private String userId;  // 用户账号
    private String password;  // 密码
    private String registMessageType = null;  // 设置是否请求注册
    private String state = null;    // 4.0 设置发送状态

    public User() { }

    public User(String userId, String password) {
        super();
        this.userId = userId;
        this.password = password;
    }

}
