package com.yk.service;

import com.yk.entity.datas.DataModel;
import com.yk.mapper.EmployeeecMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeecService {

    @Resource
    EmployeeecMapper employeeecMapper;

    public List<DataModel> getModelandView() {
        return employeeecMapper.getModelandView();
    }
}
