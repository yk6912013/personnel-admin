package com.yk.controller.personnel;

import com.yk.entity.*;
import com.yk.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/employee/info")
public class EmployeeRecycleController {

    @Resource
    EmployeeRecycleService employeeRecycleService;
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
    public RespPageBean getEmployeeRecByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size,EmployeeRecycle employeeRecycle, Date[] beginDateScope) {
        return employeeRecycleService.getEmployeeRecByPage(page, size, employeeRecycle, beginDateScope);
    }

    @GetMapping("/nations")
    public List<Nation> getAllNations() {
        return nationService.getAllNations();
    }

    @GetMapping("/politicsstatus")
    public List<Politicsstatus> getAllPoliticsstatus() {
        return politicsstatusService.getAllPoliticsstatus();
    }

    @GetMapping("/joblevels")
    public List<JobLevel> getAllEnJobLevels() {
        return jobLevelService.getAllEnJobLevels();
    }

    @GetMapping("/positions")
    public List<Position> getAllPositions() {
        return positionService.getAllEnPositions();
    }

    @GetMapping("/deps")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/maxWorkID")
    public RespBean maxWorkID() {
        RespBean respBean = RespBean.build().setStatus(200)
                .setObj(String.format("%08d", employeeRecycleService.maxWorkID() + 1));
        return respBean;
    }
}
