package com.yk.controller.system;

import com.yk.entity.LogType;
import com.yk.entity.RespPageBean;
import com.yk.service.LogTypeService;
import com.yk.service.OplogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/system/log")
public class OplogController {

    @Resource
    OplogService oplogService;
    @Resource
    LogTypeService logTypeService;

    @GetMapping("/")
    public RespPageBean getAllsOplog(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "13") Integer size, Integer logtype, Date[] beginDateScope ){
        return  oplogService.getAllsOplog(page, size, logtype,beginDateScope );
    }

    @GetMapping("/logtype")
    public List<LogType> getAllsLogtype(){
        return logTypeService.getAllsLogtype();
    }
}
