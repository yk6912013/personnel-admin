package com.yk.service;

import com.yk.entity.LogType;
import com.yk.mapper.LogTypeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LogTypeService {

    @Resource
    LogTypeMapper logTypeMapper;

    public List<LogType> getAllsLogtype() {
        return logTypeMapper.selectByPrimaryKey();
    }

}
