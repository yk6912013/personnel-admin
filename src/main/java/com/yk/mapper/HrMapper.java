package com.yk.mapper;

import com.yk.entity.Hr;
import com.yk.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HrMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    /**
     * 登录
     * @Param [username]
     **/
    Hr loadUserByUsername(String username);

    /**
     * 获取当前用户的所用角色
     * @Param [id]
     **/
    List<Role> getHrRolesById(Integer id);

    List<Hr> getAllHRs(@Param("id") Integer id, @Param("name") String name);

    List<Hr>  getAllHrsExceptCurrentHr(Integer id);
}