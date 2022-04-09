package com.yk.entity;

import lombok.Data;

/**
 * 日志类型
 */
@Data
public class LogType {

    private Integer id;
    private String logtypemsg;

    public void setLogtypemsg(String logtypemsg) {
        this.logtypemsg = logtypemsg == null ? null : logtypemsg.trim();
    }
}