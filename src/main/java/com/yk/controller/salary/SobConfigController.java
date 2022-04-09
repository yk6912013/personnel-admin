package com.yk.controller.salary;

import com.yk.entity.RespBean;
import com.yk.entity.RespPageBean;
import com.yk.entity.Salary;
import com.yk.service.EmployeeService;
import com.yk.service.SalaryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/salary/sobcfg")
public class SobConfigController {

    @Resource
    EmployeeService employeeService;
    @Resource
    SalaryService salaryService;

    @GetMapping("/")
    public RespPageBean getEmployeeByPageWithSalary(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "13") Integer size) {
        return employeeService.getEmployeeByPageWithSalary(page, size);
    }

    @GetMapping("/salaries")
    public List<Salary> getAllSalaries() {
        return salaryService.getAllSalaries();
    }

    @PutMapping("/")
    public RespBean updateEmployeeSalaryById(Integer eid, Integer sid) {
        Integer result = employeeService.updateEmployeeSalaryById(eid, sid);
        if (result == 1 || result == 2) {
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @PutMapping("/delete")
    public RespBean deleteEmployeeSalaryById(Integer eid) {
        Integer result = employeeService.deleteEmployeeSalaryById(eid);
        if (result == 1 || result == 2) {
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }
}
