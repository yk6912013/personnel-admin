package com.yk.service;

import com.yk.entity.OpLog;
import com.yk.entity.Role;
import com.yk.mapper.RoleMapper;
import com.yk.utils.Hruitls;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class RoleService {

    @Resource
    RoleMapper roleMapper;
    @Resource
    OplogService oplogService;

    /**
     * 数据初始化
     * @Param []
     * @return java.util.List<com.yk.hros.model.Role>
     **/
    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    /**
     * 添加角色权限
     * @Param [role]
     * @return java.lang.Integer
     **/
    public Integer addRole(Role role) {
        if (!role.getName().startsWith("ROLE_")) {
            role.setName("ROLE_" + role.getName());
        }
        oplogService.addOpLog(new OpLog((byte) 1,new Date(),"添加角色: 【" + role.getName() + "】", Hruitls.getCurrent().getName()));
        return roleMapper.insert(role);
    }

    /**
     * 删除角色
     * @Param [rid]
     * @return java.lang.Integer
     **/
    public Integer deleteRoleById(Integer rid) {
        oplogService.addOpLog(new OpLog((byte) 1,new Date(),"删除角色：id=【" + rid + "】", Hruitls.getCurrent().getName()));
        return roleMapper.deleteByPrimaryKey(rid);
    }
}
