package com.yk.service;

import com.yk.entity.RwardsAndPunishments;
import com.yk.mapper.RwardsAndPunishmentsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RwardsAndPunishmentsService {

    @Resource
    RwardsAndPunishmentsMapper rwardsAndPunishmentsMapper;

    public List<RwardsAndPunishments> getAllRwardsAndPunishments() {
        return  rwardsAndPunishmentsMapper.getAllRwardsAndPunishments();
    }
}
