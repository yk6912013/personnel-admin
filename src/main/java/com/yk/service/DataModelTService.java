package com.yk.service;

import com.yk.entity.datas.DataModelT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataModelTService {

    @Resource
    EmployeeService employeeService;

    public List<DataModelT> dataViewDepartment() {
       return employeeService.DataViewDepartmentT();
    }

    public List<DataModelT> dataViewWorkAge() {
        return employeeService.dataViewWorkAge();
    }

    public List<DataModelT> dataViewJobLevelT() {
        return employeeService.dataViewJobLevelTAge();
    }

}
