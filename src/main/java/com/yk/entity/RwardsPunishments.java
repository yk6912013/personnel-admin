package com.yk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 奖惩类模型
 */
@Data
public class RwardsPunishments {

    private Integer id;
    private Integer rpsystemId;
    private String rpmsg;
    private Integer rpiont;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone ="GMT+8" )
    private Date createrp;

    private RwardsAndPunishments rwardsAndPunishments;

    public void setRpmsg(String rpmsg) {
        this.rpmsg = rpmsg == null ? null : rpmsg.trim();
    }

}