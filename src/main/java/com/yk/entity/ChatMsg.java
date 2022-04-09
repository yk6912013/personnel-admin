package com.yk.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 聊天实体类
 */
@Data
public class ChatMsg implements Serializable {

    private String from;
    private String to;
    private String content;
    private Date date;
    private String fromNickname;
    
}
