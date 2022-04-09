package com.yk.entity;

import lombok.Data;

/**
 * 角色类
 */
@Data
public class Role {

    private Integer id;
    private String name;
    private String namezh;

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public void setNamezh(String namezh) {
        this.namezh = namezh == null ? null : namezh.trim();
    }
}