package com.yk.controller.emp;

import com.yk.entity.Employee;
import com.yk.entity.RespPageBean;
import com.yk.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/employee/advanced")
public class EmpadvancedController {

    @Resource
    EmpadvancedService empadvancedService;
    @Resource
    EmployeeService employeeService;
    @Resource
    NationService nationService;
    @Resource
    PoliticsstatusService politicsstatusService;
    @Resource
    JobLevelService jobLevelService;
    @Resource
    PositionService positionService;
    @Resource
    DepartmentService departmentService;
    @Resource
    EmployeeecService employeeecService;

    @GetMapping("/")
    public RespPageBean getAllsEmpadvanced(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, Employee employee, Date[] beginDateScope){
        return empadvancedService.getAllsEmpadvanced(page, size, employee, beginDateScope);
    }

}
