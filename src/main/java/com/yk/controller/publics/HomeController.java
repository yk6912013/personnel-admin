package com.yk.controller.publics;

import com.yk.entity.MainNorice;
import com.yk.entity.OpLog;
import com.yk.service.MainNoriceService;
import com.yk.service.OplogService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HomeController {

    @Resource
    MainNoriceService mainNoriceService;
    @Resource
    OplogService oplogService;

    @GetMapping("/body")
    @Scheduled(cron = "0 0 3 * * ?")
    public List<MainNorice> getAllsMainNoricebody(){
        return mainNoriceService.getAllsMainNoricebody();
    }

    @GetMapping("/log")
    @Scheduled(cron = "0 0 3 * * ?")
    public List<OpLog> getAllsOplog(){
        return oplogService.getAllsOplogm();
    }

}
