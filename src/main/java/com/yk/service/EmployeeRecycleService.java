package com.yk.service;

import com.yk.entity.Employee;
import com.yk.entity.EmployeeRecycle;
import com.yk.entity.RespPageBean;
import com.yk.entity.datas.DataModel;
import com.yk.entity.datas.DataModels;
import com.yk.mapper.EmployeeRecycleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeRecycleService {

    @Resource
    EmployeeRecycleMapper employeeRecycleMapper;

    public void addEmployeeRecycle(Employee employee){
        employeeRecycleMapper.insertSelective(employee);
    }

    public RespPageBean getEmployeeRecByPage(Integer page, Integer size, EmployeeRecycle employeeRecycle, Date[] beginDateScope) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<EmployeeRecycle> data = employeeRecycleMapper.getEmployeeRecByPage(page, size, employeeRecycle, beginDateScope);
        Long total = employeeRecycleMapper.getTotal(employeeRecycle, beginDateScope);
        return new RespPageBean(total, data);
    }

    public Integer maxWorkID() {
        return employeeRecycleMapper.maxWorkID();
    }

    public List<EmployeeRecycle> getAllEmployeeRecycle() {
        return employeeRecycleMapper.selectByPrimaryKey();
    }

    public List<DataModel> dataViewDepartment() {
        return employeeRecycleMapper.dataViewDepartment();
    }

    public List<DataModels> dataViewPosition() {
        return employeeRecycleMapper.dataViewPosition();
    }

    public List<DataModels> dataViewJobLevelT() {
        return employeeRecycleMapper.dataViewJobLevelT();
    }

}
