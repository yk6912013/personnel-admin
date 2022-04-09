package com.yk.service;

import com.yk.entity.Employeetrain;
import com.yk.mapper.EmployeetrainMapper;
import com.yk.utils.LogUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service
public class EmployeetrainService {

    @Resource
    EmployeetrainMapper employeetrainMapper;
    @Resource
    OplogService oplogService;

    public Integer addEmployeetrain(Employeetrain employeetrain) {
        oplogService.addOpLog(LogUtils.addLog((byte) 4,"添加培训：eid=【"+employeetrain.getEid()+"】"));
        return employeetrainMapper.insertSelective(employeetrain);
    }

    public Integer updateEmployeetrain(Employeetrain employeetrain) {
        oplogService.addOpLog(LogUtils.addLog((byte) 4,"员工培训：eid=【" + employeetrain.getEid() + "】"));
        return employeetrainMapper.updateByPrimaryKeySelective(employeetrain);
    }

    public Integer deleteEmployeetrain(Integer eid, Integer id) {
        oplogService.addOpLog(LogUtils.addLog((byte) 4,"取消员工培训：eid=【" +eid+"】"));
        return employeetrainMapper.deleteByEmployeetrain( eid, id);
    }

    public Integer addEmploteetByPge(Employeetrain employeetrain, Integer[] ids) {
          oplogService.addOpLog(LogUtils.addLog((byte) 4,"批量添加培训：ids=【" +ids+ "】"));
          return employeetrainMapper.addEmploteetByPge(employeetrain, ids);
    }

}


