package com.yk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 工资账套类
 */
@Data
public class Salary {

    private Integer id;
    private Integer basicsalary;
    private Integer bonus;
    private Integer lunchsalary;
    private Integer trafficsalary;
    private Integer allsalary;
    private Integer pensionbase;
    private Float pensionper;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdate;
    private Integer medicalbase;
    private Float medicalper;
    private Integer accumulationfundbase;
    private Float accumulationfundper;
    private String name;

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}