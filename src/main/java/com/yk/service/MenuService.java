package com.yk.service;

import com.yk.entity.Menu;
import com.yk.entity.OpLog;
import com.yk.mapper.MenuMapper;
import com.yk.mapper.MenuRoleMapper;
import com.yk.utils.Hruitls;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 菜单处理
 */
@Transactional
@Service
public class MenuService {

    @Resource
    MenuMapper menuMapper;
    @Resource
    MenuRoleMapper menuRoleMapper;
    @Resource
    OplogService oplogService;

    /**
     * 根据角色id获取权限菜单
     * @Date 22:20 2019/12/22
     * @Param []
     **/
    public List<Menu> getMenusById() {
        return menuMapper.getMenusByHrId(Hruitls.getCurrent().getId());
    }

    /**
     * 获取所有权限菜单, springSecurity权限处理
     * @Param []
     **/
    // @Cacheable
    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

    /**
     * 菜单数据初始化，菜单处理
     * @Param []
     **/
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    /**
     * 获取当前角色权限
     * @Param [rid]
     **/
    public List<Integer> getMidsByRid(Integer rid) {
        return menuRoleMapper.getMidsByRid(rid);
    }

    /**
     * 更新信息
     * @Param [rid, mids]
     **/
    @Transactional
    public boolean updateMenuRole(Integer rid, Integer[] mids) {
        oplogService.addOpLog(new OpLog((byte) 1, new Date(), "角色权限变更", Hruitls.getCurrent().getName()));
        menuRoleMapper.deleteByRid(rid);
        if (mids != null && mids.length > 0) {
            Integer result = menuRoleMapper.insertRecord(rid, mids);
            return result == mids.length;
        } else {
            return true;
        }
    }
}
