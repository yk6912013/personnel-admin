package com.yk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 日志类
 */
@Data
public class OpLog {

    private Integer id;
    private Byte logtype;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone ="GMT+8" )
    private Date adddate;
    private String operate;
    private String hrname;
    private LogType logTypss;

    public OpLog() {
    }

    public OpLog(Byte logtype, String operate, String hrname) {
        this.logtype = logtype;
        this.operate = operate;
        this.hrname = hrname;
    }

    public OpLog(Byte logtype, Date adddate, String operate, String hrname) {
        this.logtype = logtype;
        this.adddate = adddate;
        this.operate = operate;
        this.hrname = hrname;
    }

    public void setOperate(String operate) {
        this.operate = operate == null ? null : operate.trim();
    }

    public void setHrname(String hrname) {
        this.hrname = hrname == null ? null : hrname.trim();
    }
}