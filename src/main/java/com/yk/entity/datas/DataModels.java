package com.yk.entity.datas;

import lombok.Data;

/**
 * 返回数据模型<s>
 */
@Data
public class DataModels extends DataModel {

    private Integer workage;

    public DataModels(Integer sum, String name ,Integer workage) {
        super(name, sum);
        this.workage = workage;
    }

    public DataModels() {
        super();
        this.workage = 0;
    }
}
