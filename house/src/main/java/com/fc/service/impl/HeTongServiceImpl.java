package com.fc.service.impl;

import com.fc.entity.Hetong;
import com.fc.mapper.HeTongMapper;
import com.fc.service.HeTongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeTongServiceImpl implements HeTongService {

    @Autowired
    HeTongMapper heTongMapper;

    @Override
    public void deleteHeTong(String house_id) {
        heTongMapper.deleteHeTong(house_id);
    }

    public Hetong findHeTongByHouseId(String house_id){
        return heTongMapper.findHeTongByHouseId(house_id);
    }
}
