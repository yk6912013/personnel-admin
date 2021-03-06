package com.yk.mapper;

import com.yk.entity.Employeeec;
import com.yk.entity.datas.DataModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeecMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    int insertSelective(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeec record);

    int updateByPrimaryKey(Employeeec record);

    Integer insertSelectives(@Param("employeeec") Employeeec employeeec, @Param("ids") Integer[] ids);

    Integer  deleteEmpByEidc(@Param("eid") Integer eid,@Param("id") Integer id);

    List<DataModel>  getModelandView();
}