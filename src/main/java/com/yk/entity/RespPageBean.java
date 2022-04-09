package com.yk.entity;

import java.util.List;

/**
 * 分页模型
 */
public class RespPageBean {

    /*总记录树*/
    private Long total;
    /*分页数据*/
    private List<?> data;

    public RespPageBean() {
    }

    public RespPageBean(Long total, List<?> data) {
        this.total = total;
        this.data = data;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
