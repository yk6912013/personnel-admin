package com.yk.entity.datas;

import lombok.Data;

/**
 * 返回数据模型
 */
@Data
public class DataModel {

    private  String name;
    private Integer sum;

    public DataModel() {
        this.name = null;
        this.sum = 0;
    }

    public DataModel(String name, Integer sum) {
        this.name = name;
        this.sum = sum;
    }
}
