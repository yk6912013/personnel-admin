package com.yk.entity;

/**
 * @Description :标识属性
 * @Author: yk
 * @Date: 2021/12/21 13:06
 */
public class Meta {

    private Boolean keepalive;
    private Boolean requireauth;

    public Boolean getKeepalive() {
        return keepalive;
    }

    public void setKeepalive(Boolean keepalive) {
        this.keepalive = keepalive;
    }

    public Boolean getRequireauth() {
        return requireauth;
    }

    public void setRequireauth(Boolean requireauth) {
        this.requireauth = requireauth;
    }
}
