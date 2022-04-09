package com.yk.entity.datas;

import lombok.Data;

/**
 * 返回数据模型<T>
 */
@Data
public class DataModelT  extends DataModel{

    private Integer dimission;
    private Integer entrant;
    private Double aDouble;

    public DataModelT() {
        super();
        this.dimission = 0;
        this.entrant = 0;
        this.aDouble = 0d;
    }

    public DataModelT(Integer entrant, String name) {
        super(name,0);
        this.dimission = 0;
        this.entrant = entrant;
        this.aDouble = 0d;
    }

    public DataModelT(String name, Integer entrant,Integer sum) {
        super(name, sum);
        this.dimission = 0;
        this.entrant = entrant;
        this.aDouble = 0d;
    }

    public void setaDouble(double v) {
    }
}
