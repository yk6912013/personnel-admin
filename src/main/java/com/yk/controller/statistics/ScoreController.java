package com.yk.controller.statistics;

import com.yk.entity.datas.DataModel;
import com.yk.service.EmployeecService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/statistics/score")
@RestController
public class ScoreController {

    @Resource
    EmployeecService employeecService;

    @GetMapping("/")
    @Scheduled(cron = "0 0 3 * * ?")
    public List<DataModel> getModelandView(){
          return employeecService.getModelandView();
    }
}
