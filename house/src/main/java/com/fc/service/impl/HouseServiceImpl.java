package com.fc.service.impl;

import com.fc.entity.HouseList;
import com.fc.mapper.HouseMapper;
import com.fc.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    HouseMapper houseMapper;

    @Override
    public List<HouseList> queryAllHouse() {
        return houseMapper.queryAllHouse();
    }

    @Override
    public HouseList findById(HouseList houseList) {
        return houseMapper.findById(houseList);
    }

    @Override
    public int updateHouse(HouseList houseList) {
        return houseMapper.updateHouse(houseList);
    }

    @Override
    public int deleteHouse(Integer id) {
        return houseMapper.deleteHouse(id);
    }

    @Override
    public int addHouse(HouseList houseList) {
        return houseMapper.addHouse(houseList);
    }

}
