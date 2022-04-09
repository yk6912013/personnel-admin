package com.yk.service;

import com.yk.entity.Politicsstatus;
import com.yk.mapper.PoliticsstatusMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PoliticsstatusService {

    @Resource
    PoliticsstatusMapper politicsstatusMapper;

    public List<Politicsstatus> getAllPoliticsstatus() {
        return politicsstatusMapper.getAllPoliticsstatus();
    }

}
