package com.yk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 员工奖惩类
 */
@Data
public class Employeeec {

    private Integer id;
    private Integer eid;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8" )
    private Date ecdate;
    private String ecreason;
    private Integer ecpoint;
    private Integer ectype;
    private String remark;

    private RwardsPunishments rwardsPunishments;

    public void setEcreason(String ecreason) {
        this.ecreason = ecreason == null ? null : ecreason.trim();
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "Employeeec{" +
                "id=" + id +
                ", eid=" + eid +
                ", ecdate=" + ecdate +
                ", ecreason='" + ecreason + '\'' +
                ", ecpoint=" + ecpoint +
                ", ectype=" + ectype +
                ", remark='" + remark + '\'' +
                '}';
    }
}