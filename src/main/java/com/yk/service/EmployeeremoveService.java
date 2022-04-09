package com.yk.service;

import com.yk.entity.Employeeremove;
import com.yk.mapper.EmployeeremoveMapper;
import com.yk.utils.LogUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class EmployeeremoveService {

    @Resource
    EmployeeremoveMapper employeeremoveMapper;
    @Resource
    OplogService oplogService;

    public Integer addEmploymove(Employeeremove employeeremove) {
       oplogService.addOpLog(LogUtils.addLog((byte) 6,"员工调动：eid=【"+employeeremove.getEid() + "】"));
       return employeeremoveMapper.insertSelective(employeeremove);
    }
}
