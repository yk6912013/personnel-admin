package com.yk.service;

import com.yk.entity.OpLog;
import com.yk.entity.Salary;
import com.yk.mapper.SalaryMapper;
import com.yk.utils.Hruitls;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class SalaryService {

    @Resource
    SalaryMapper salaryMapper;
    @Resource
    OplogService oplogService;

    public List<Salary> getAllSalaries() {
        return salaryMapper.getAllSalaries();
    }

    public Integer addSalary(Salary salary) {
        oplogService.addOpLog(new OpLog((byte) 5, new Date(), "添加账套：name=【" +salary.getName() +"】", Hruitls.getCurrent().getName()));
        salary.setCreatedate(new Date());
        salary.setAllsalary( salary.getBasicsalary() + salary.getBonus() + salary.getLunchsalary() + salary.getTrafficsalary() + salary.getPensionbase() );
        return salaryMapper.insertSelective(salary);
    }

    public Integer deleteSalaryById(Integer id) {
        oplogService.addOpLog(new OpLog((byte) 5, new Date(), "删除账套：id=【" +id+ "】" , Hruitls.getCurrent().getName()));
        return salaryMapper.deleteByPrimaryKey(id);
    }

    public Integer updateSalaryById(Salary salary) {
        salary.setAllsalary( salary.getBasicsalary() + salary.getBonus() + salary.getLunchsalary() + salary.getTrafficsalary() + salary.getPensionbase() );
        oplogService.addOpLog(new OpLog((byte) 5, new Date(), "更新账套：【" + salary.getName() + "】", Hruitls.getCurrent().getName()));
        return salaryMapper.updateByPrimaryKeySelective(salary);
    }
}
