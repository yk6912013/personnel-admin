package com.yk.service;

import com.yk.entity.JobLevel;
import com.yk.entity.OpLog;
import com.yk.entity.Position;
import com.yk.mapper.JobLevelMapper;
import com.yk.utils.Hruitls;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class JobLevelService implements Serializable {

    @Resource
    JobLevelMapper jobLevelMapper;
    @Resource
    OplogService oplogService;

    public List<JobLevel> getAllJobLevels() {
        return  jobLevelMapper.getAllJobLevels();
    }

    public List<JobLevel> getAllEnJobLevels() {
        return  jobLevelMapper.getAllEnJobLevels();
    }

    public Integer addJobLevel(JobLevel jobLevel) {
        jobLevel.setCreatedate(new Date());
        jobLevel.setEnabled(true);
        oplogService.addOpLog(new OpLog((byte) 1,new Date(),"添加职称：【" + jobLevel.getName() + "】", Hruitls.getCurrent().getName()));
        return jobLevelMapper.insertSelective(jobLevel);
    }

    public Integer updateJobLevelById(JobLevel jobLevel) {
        oplogService.addOpLog(new OpLog((byte) 1,new Date(),"更新职称：【" + jobLevel.getName() + "】", Hruitls.getCurrent().getName()));
        return jobLevelMapper.updateByPrimaryKeySelective(jobLevel);
    }

    public Integer deleteJobLevelById(Integer id) {
        oplogService.addOpLog(new OpLog((byte) 1,new Date(),"删除职称：id=【" + id + "】", Hruitls.getCurrent().getName()));

        return jobLevelMapper.deleteByPrimaryKey(id);
    }

    public Integer deleteJobLevelByIds(Integer[] ids) {
        oplogService.addOpLog(new OpLog((byte) 1,new Date(),"批量删除职称：ids=【" + ids.toString() + "】", Hruitls.getCurrent().getName()));

        return jobLevelMapper.deleteJobLevelByIds(ids);
    }

    public List<Position> serchJobLevel(JobLevel jobLevel) {
        jobLevel.setName("%"+jobLevel.getName()+"%");
        return jobLevelMapper.serchJobLeve(jobLevel);
    }
}
