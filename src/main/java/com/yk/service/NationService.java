package com.yk.service;

import com.yk.entity.Nation;
import com.yk.mapper.NationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NationService {

    @Resource
    NationMapper nationMapper;

    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}
