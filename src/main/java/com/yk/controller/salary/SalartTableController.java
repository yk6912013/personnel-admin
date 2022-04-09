package com.yk.controller.salary;

import com.yk.entity.Employee;
import com.yk.entity.RespPageBean;
import com.yk.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/salary/table")
public class SalartTableController {

    @Resource
    EmployeeService employeeService;

    @GetMapping("/")
    public RespPageBean getAllsalarts(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, Employee employee, Date[] beginDateScope){
       return employeeService.getAllsalarts(page,size,employee,beginDateScope);
    }
}
