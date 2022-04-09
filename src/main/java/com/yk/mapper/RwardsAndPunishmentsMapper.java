package com.yk.mapper;

import com.yk.entity.RwardsAndPunishments;

import java.util.List;

public interface RwardsAndPunishmentsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RwardsAndPunishments record);

    int insertSelective(RwardsAndPunishments record);

    RwardsAndPunishments selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RwardsAndPunishments record);

    int updateByPrimaryKey(RwardsAndPunishments record);

    List<RwardsAndPunishments>  getAllRwardsAndPunishments();
}