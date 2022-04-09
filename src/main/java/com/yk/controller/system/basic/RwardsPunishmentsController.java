package com.yk.controller.system.basic;

import com.yk.entity.RespBean;
import com.yk.entity.RwardsAndPunishments;
import com.yk.entity.RwardsPunishments;
import com.yk.service.RwardsAndPunishmentsService;
import com.yk.service.RwardsPunishmentsSevice;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/system/basic/rp")
public class RwardsPunishmentsController {

    @Resource
    RwardsPunishmentsSevice rwardsPunishmentsSevice;
    @Resource
    RwardsAndPunishmentsService rwardsAndPunishmentsService;

    @GetMapping("/")
    public List<RwardsPunishments> getAllRwardsPunishments() {
        return rwardsPunishmentsSevice.getAllRwardsPunishments();
    }

    @GetMapping("/rap/")
    public List<RwardsAndPunishments> getAllRwardsAndPunishments(){
        return rwardsAndPunishmentsService.getAllRwardsAndPunishments();
    };

    @PutMapping("/")
    public RespBean updateRwardsPunishments(@RequestBody RwardsPunishments rwardsPunishments) {
        if (rwardsPunishmentsSevice.updateRwardsPunishments(rwardsPunishments) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @PostMapping("/")
    public RespBean addRwardsPunishments(@RequestBody RwardsPunishments rwardsPunishments) {
        if (rwardsPunishmentsSevice.addRwardsPunishments(rwardsPunishments) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteRwardsPunishmentsById( @PathVariable Integer id){
        if (rwardsPunishmentsSevice.deleteRwardsPunishmentsById(id) == 1){
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    @DeleteMapping("/")
    public RespBean deleteRwardsPunishmentsByIds(Integer[] ids){
        if (rwardsPunishmentsSevice.deleteRwardsPunishmentsByIds(ids) == ids.length) {
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    @PostMapping("/serch/")
    public List<RwardsPunishments> sercRwardsPunishments(@RequestBody RwardsPunishments rwardsPunishments){
        return rwardsPunishmentsSevice.sercRwardsPunishments(rwardsPunishments);
    }
}

