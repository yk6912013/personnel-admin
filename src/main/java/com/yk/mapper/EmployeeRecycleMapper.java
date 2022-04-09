package com.yk.mapper;

import com.yk.entity.Employee;
import com.yk.entity.EmployeeRecycle;
import com.yk.entity.datas.DataModel;
import com.yk.entity.datas.DataModels;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface EmployeeRecycleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeRecycle record);

    int insertSelective(Employee record);

    List<EmployeeRecycle> selectByPrimaryKey( );

    int updateByPrimaryKeySelective(EmployeeRecycle record);

    int updateByPrimaryKey(EmployeeRecycle record);

    List<DataModel>  dataViewDepartment();

    List<DataModels>  dataViewPosition();

    List<DataModels>  dataViewJobLevelT();

    Integer maxWorkID();

    Long getTotal(@Param("emp") EmployeeRecycle employeeRecycle, @Param("beginDateScope") Date[] beginDateScope);

    List<EmployeeRecycle> getEmployeeRecByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("emp") EmployeeRecycle EmployeeRecycle, @Param("beginDateScope") Date[] beginDateScope);
}