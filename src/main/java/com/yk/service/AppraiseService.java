package com.yk.service;

import com.yk.entity.Appraise;
import com.yk.mapper.AppraiseMapper;
import com.yk.utils.LogUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AppraiseService {

    @Resource
    AppraiseMapper appraiseMapper;
    @Resource
    OplogService oplogService;

    public Integer addAppraise(Appraise appraise) {
        oplogService.addOpLog(LogUtils.addLog((byte) 10,"添加员工考评：eid：【"+ appraise.getEid() +"】"));
        return appraiseMapper.insertSelective(appraise);
    }

    public Integer deleteAppraise(Integer eid, Integer id) {
        oplogService.addOpLog(LogUtils.addLog((byte) 10,"删除员工考评：eid=【"+ eid +"】"));
        return appraiseMapper.deleteAppraise(eid, id);
    }

    public Integer updateAppraise(Appraise appraise) {
        oplogService.addOpLog(LogUtils.addLog((byte) 10,"更新员工考评：eid=【"+ appraise.getEid() +"】"));
        return appraiseMapper.updateByPrimaryKeySelective(appraise);
    }

    public Integer addEmploteeaByPge(Appraise appraise, Integer[] ids) {
        oplogService.addOpLog(LogUtils.addLog((byte) 10,"批量添加员工考评"));
        return appraiseMapper.addEmploteeaByPge(appraise, ids);
    }
}
