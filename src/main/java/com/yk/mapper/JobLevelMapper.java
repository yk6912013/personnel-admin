package com.yk.mapper;

import com.yk.entity.JobLevel;
import com.yk.entity.Position;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobLevelMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(JobLevel record);

    int insertSelective(JobLevel record);

    JobLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobLevel record);

    int updateByPrimaryKey(JobLevel record);

    List<JobLevel> getAllJobLevels();

    /**
     * 获取所有可用的职称列表数据
     * @return
     */
    List<JobLevel> getAllEnJobLevels();

    Integer deleteJobLevelByIds(@Param("ids")Integer[] ids);

    List<Position> serchJobLeve(JobLevel jobLevel);

}