package com.yk.controller.personnel;

import com.yk.entity.*;
import com.yk.service.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/personnel/ec")
public class EmployeeecController {

    @Resource
    EmployeeecService employeeecService;
    @Resource
    JobLevelService jobLevelService;
    @Resource
    PositionService positionService;
    @Resource
    EmployeeService employeeService;
    @Resource
    RwardsPunishmentsSevice rwardsPunishmentsSevice;

    @GetMapping("/")
    public RespBean addEmployeeec(Employeeec employeeec, Integer[] ids){
        if (employeeecService.addEmployeeec(employeeec, ids) == ids.length){
            return RespBean.ok("添加成功");
        }else {
            return RespBean.error("添加失败");
        }
    }

    @GetMapping("/init")
    public RespPageBean getEmploteeByPge(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size,Employee employee, Date[] beginDateScope) {
        return employeeService.getEmploteeByPge(page, size, employee, beginDateScope);
    }

    @GetMapping("/rp")
    public List<RwardsPunishments> getAllRwardsPunishments() {
        return rwardsPunishmentsSevice.getAllRwardsPunishments();
    }

    @GetMapping("/ec")
    public RespPageBean getEmploteecByPge(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "100") Integer size, Employee employee, Date[] beginDateScope) {
        return employeeService.getEmploteecByPge(page, size, employee, beginDateScope);
    }

    @DeleteMapping("/{eid}/{id}")
    public RespBean deleteEmpByEidc(@PathVariable Integer eid, @PathVariable Integer id) {
        if (employeeecService.deleteEmpByEidc(eid,id) == 1) {
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    @GetMapping("/joblevels")
    public List<JobLevel> getAllJobLevels() {
        return jobLevelService.getAllJobLevels();
    }

    @GetMapping("/positions")
    public List<Position> getAllPositions() {
        return positionService.getAllPositions();
    }

}
