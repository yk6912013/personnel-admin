package com.yk.controller.systems;

import com.yk.entity.Menu;
import com.yk.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单加载
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {

    @Resource
    MenuService menuService;

    /**
     * 系统菜单加载
     * @Param []
     **/
    @GetMapping("/menu")
    public List<Menu> getMenusByHrId(){
        return menuService.getMenusById();
    }
}
