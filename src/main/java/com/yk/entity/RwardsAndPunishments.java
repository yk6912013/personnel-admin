package com.yk.entity;

import lombok.Data;

/**
 * 奖惩类
 */
@Data
public class RwardsAndPunishments {

    private Integer id;
    private String rpsystem;

    public void setRpsystem(String rpsystem) {
        this.rpsystem = rpsystem == null ? null : rpsystem.trim();
    }
}