package com.yk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 员工调动类
 */
@Data
public class Employeeremove {

    private Integer id;
    private Integer eid;
    private Integer afterdepid;
    private Integer afterjobid;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8" )
    private Date removedate;
    private String reason;
    private String remark;

    private Department department;
    private JobLevel jobLevel;

    public Employeeremove() {
    }

    public Employeeremove(Integer eid, Integer afterdepid, Integer afterjobid, Date removedate, String reason) {
        this.eid = eid;
        this.afterdepid = afterdepid;
        this.afterjobid = afterjobid;
        this.removedate = removedate;
        this.reason = reason;
        this.remark = remark;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}