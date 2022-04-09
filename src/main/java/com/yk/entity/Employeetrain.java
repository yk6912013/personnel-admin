package com.yk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 员工培类
 */
@Data
public class Employeetrain {

    private Integer id;
    private Integer eid;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8" )
    private Date trainstartdate;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8" )
    private Date trainfinishdate;
    private String traincontent;
    private Byte trainstatus;
    private String remark;

    public void setTraincontent(String traincontent) {
        this.traincontent = traincontent == null ? null : traincontent.trim();
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "Employeetrain{" +
                "id=" + id +
                ", eid=" + eid +
                ", trainstartdate=" + trainstartdate +
                ", trainfinishdate=" + trainfinishdate +
                ", traincontent='" + traincontent + '\'' +
                ", trainstatus=" + trainstatus +
                ", remark='" + remark + '\'' +
                '}';
    }
}