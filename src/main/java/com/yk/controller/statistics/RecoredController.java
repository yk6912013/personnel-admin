package com.yk.controller.statistics;

import com.yk.entity.datas.DataModelT;
import com.yk.service.DataModelTService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/statistics/recored")
public class RecoredController {

    @Resource
    DataModelTService dataModelTService;

    /**
     * 部门入职统计，离职统计 离职率
     * @Param []
     * @return java.util.List<com.yk.hros.model.datas.DataModelT>
     **/
    @Scheduled(cron = "0 0 3 * * ?")
    @GetMapping("/department")
    public List<DataModelT> dataViewDepartment(){
          return   dataModelTService.dataViewDepartment();
      }

    /**
     * 职位入职统计，离职统计 离职工龄 离职率
     * @Param []
     * @return java.util.List<com.yk.hros.model.datas.DataModelT>
     **/
     @Scheduled(cron = "0 0 3 * * ?")
     @GetMapping("/workAge")
     public List<DataModelT> dataViewWorkAge(){
        return dataModelTService.dataViewWorkAge();
      }

    /**
     * 职称入职统计，离职统计 离职工龄 离职率
     * @Param []
     * @return java.util.List<com.yk.hros.model.datas.DataModelT>
    **/
    @GetMapping("/JobLevel")
    @Scheduled(cron = "0 0 3 * * ?")
    public List<DataModelT> DataViewJobLevelT(){
        return dataModelTService.dataViewJobLevelT();
    }

    /**
     * 部门信息统计
     * @Param []
     * @return java.util.List<com.yk.hros.model.datas.DataModelT>
     **/
    @GetMapping("/Department")
    @Scheduled(cron = "0 0 3 * * ?")
    public List<DataModelT> DataViewDepartment(){
        return dataModelTService.dataViewDepartment();
    }


}
