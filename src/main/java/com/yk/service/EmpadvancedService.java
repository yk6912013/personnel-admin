package com.yk.service;

import com.yk.entity.Employee;
import com.yk.entity.RespPageBean;
import com.yk.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class EmpadvancedService {


    @Resource
    EmployeeMapper employeeMapper;
    @Resource
    OplogService oplogService;
    @Resource
    EmployeeRecycleService employeeRecycleService;

    public RespPageBean getAllsEmpadvanced(Integer page, Integer size, Employee employee, Date[] beginDateScope) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<Employee> data = employeeMapper.getAllsEmpadvanced(page, size, employee, beginDateScope);
        Long total = employeeMapper.getTotalE(employee, beginDateScope);
        return new RespPageBean(total, data);
    }
}
