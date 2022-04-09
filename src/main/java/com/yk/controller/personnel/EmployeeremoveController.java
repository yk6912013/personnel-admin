package com.yk.controller.personnel;

import com.yk.entity.*;
import com.yk.service.DepartmentService;
import com.yk.service.EmployeeService;
import com.yk.service.EmployeeremoveService;
import com.yk.service.PositionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/personnel/remove")
public class EmployeeremoveController {

    @Resource
    EmployeeService employeeService;
    @Resource
    PositionService positionService;
    @Resource
    DepartmentService departmentService;
    @Resource
    EmployeeremoveService employeeremoveService;

    @GetMapping("/")
    public RespPageBean getEmploteeByPge(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, Employee employee, Date[] beginDateScope) {
        return employeeService.getEmploteeByPgeM(page, size, employee, beginDateScope);
    }

    @GetMapping("/positions")
    public List<Position> getAllPositions() {
        return positionService.getAllPositions();
    }

    @GetMapping("/deps")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PutMapping("/")
    public RespBean updateEmp(@RequestBody Employee employee) {
        Employeeremove employeeremove = new Employeeremove(employee.getId(),employee.getDepartmentid(),employee.getJoblevelid(),new Date(),employee.getWorkstate());
        employee.setWorkstate("在职");
        if (employeeService.updateEmp(employee) + employeeremoveService.addEmploymove(employeeremove) == 2) {
            return RespBean.ok("调动成功!");
        }
        return RespBean.error("调动失败!");
    }
}
