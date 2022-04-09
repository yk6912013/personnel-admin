package com.yk.entity;

import lombok.Data;

import java.util.Date;

/**
 * 员工调薪类
 */
@Data
public class AdjustSalary {

    private Integer id;
    private Integer eid;
    private Date asdate;
    private Integer beforesalary;
    private Integer aftersalary;
    private String reason;
    private String remark;

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}