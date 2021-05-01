package com.fc.service;

import com.fc.entity.HouseList;

import java.util.List;

public interface HouseService {

    List<HouseList> queryAllHouse();

    HouseList findById(HouseList houseList);

    int updateHouse(HouseList houseList);

    int deleteHouse(Integer id);

    int addHouse(HouseList houseList);
}
