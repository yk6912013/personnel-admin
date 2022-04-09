package com.yk.service;

import com.yk.entity.OpLog;
import com.yk.entity.Position;
import com.yk.mapper.PositionMapper;
import com.yk.utils.Hruitls;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class PositionService {

    @Resource
    PositionMapper positionMapper;
    @Resource
    OplogService oplogService;

    public List<Position> getAllPositions() {
        return positionMapper.getAllPositions();
    }

    public List<Position> getAllEnPositions() {
        return positionMapper.getAllEnPositions();
    }

    public Integer addPosition(Position position) {
        // 设置默认值
        position.setEnabled(true);
        position.setCreatedate(new Date());
        oplogService.addOpLog(new OpLog((byte) 1,new Date(),"添加职位：【" + position.getName() + "】", Hruitls.getCurrent().getName()));
        return positionMapper.insertSelective(position);
    }

    public Integer updatePositions(Position position) {
        position.setCreatedate(new Date());
        oplogService.addOpLog(new OpLog((byte) 1,new Date(),"更新职位：【"+ position.getName() +"】", Hruitls.getCurrent().getName()));
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    public Integer deletePositionById(Integer id) {
        oplogService.addOpLog(new OpLog((byte) 1,new Date(),"删除职位：id=【" + id + "】", Hruitls.getCurrent().getName()));
        return positionMapper.deleteByPrimaryKey(id);
    }

    public Integer deletePositionsByIds(Integer[] ids) {
        List<String> idsList = new ArrayList<>();
        idsList.add(ids.toString());
        oplogService.addOpLog(new OpLog((byte) 1,new Date(),"批量删除职位：ids=" + idsList, Hruitls.getCurrent().getName()));
        return positionMapper.deletePositionsByIds(ids);
    }

    public List<Position> serchPositions(Position position) {
        position.setName("%"+position.getName()+"%");
        return positionMapper.serchPositions(position);
    }
}
