package com.yk.service;

import com.yk.entity.Employeeec;
import com.yk.mapper.EmployeeecMapper;
import com.yk.utils.LogUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;

@Service
public class EmployeeecService {

    @Resource
    EmployeeecMapper employeeecMapper;
    @Resource
    OplogService oplogService;

    public Integer addEmployeeec(Employeeec employeeec, Integer[] ids) {
        employeeec.setEcdate(new Date());
        oplogService.addOpLog(LogUtils.addLog((byte) 3,"员工奖惩添加：eid=【"+ employeeec.getEid()+"】ids：【"+ Arrays.toString(ids) + "】"));
        return   employeeecMapper.insertSelectives(employeeec,  ids);
    }

    public Integer deleteEmpByEidc(Integer eid, Integer id) {
        oplogService.addOpLog(LogUtils.addLog((byte) 3,"员工奖惩删除：eid=【"+ eid+"】id：【"+ id + "】"));
        return employeeecMapper.deleteEmpByEidc(eid, id);
    }

}
