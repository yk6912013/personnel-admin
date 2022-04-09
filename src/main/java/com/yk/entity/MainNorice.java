package com.yk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 公告类
 */
@Data
public class MainNorice implements Serializable {

    private Integer id;
    private String title;
    private String authon;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone ="GMT+8" )
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone ="GMT+8" )
    private Date updateTime;
    private String mainbody;

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}