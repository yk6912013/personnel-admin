package com.yk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Appraise {

    private Integer id;
    private Integer eid;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8" )
    private Date appdate;
    private String appresult;
    private String appcontent;
    private String remark;

    public void setAppresult(String appresult) {
        this.appresult = appresult == null ? null : appresult.trim();
    }

    public void setAppcontent(String appcontent) {
        this.appcontent = appcontent == null ? null : appcontent.trim();
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}