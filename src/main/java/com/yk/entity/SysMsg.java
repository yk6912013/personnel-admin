package com.yk.entity;

import lombok.Data;

/**
 * 消息类
 */
@Data
public class SysMsg {

    private Integer id;
    private Integer mid;
    private Integer type;
    private Integer hrid;
    private Integer state;

}