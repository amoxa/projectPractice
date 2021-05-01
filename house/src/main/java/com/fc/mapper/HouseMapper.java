package com.fc.mapper;

import com.fc.entity.HouseList;

import java.util.List;

/**
 * Description: 房屋相关
 *
 * @author : Juice
 */
public interface HouseMapper {
    /**
     * 查询所有房屋信息
     *
     * @return 带有房屋信息的集合
     */
    List<HouseList> queryAllHouse();

    /**
     * 根据id查询房屋信息
     *
     * @param id 主键id
     * @return 查询出的房屋信息实体类
     */
    HouseList findById(HouseList id);

    /**
     * 根据房屋查询房屋，主要是判断房屋是否存在
     *
     * @param houseList
     * @return
     */
    HouseList findByHouse(HouseList houseList);

    /**
     * 更新房屋信息
     *
     * @param houselist 要更改为的信息
     * @return 更改的条数
     */
    int updateHouse(HouseList houselist);

    /**
     * 根据id删除房屋信息
     *
     * @param id 主键id
     * @return 删除的条数
     */
    int deleteHouse(int id);

    /**
     * 添加房屋信息
     *
     * @param houseList 需要添加的数据
     */
    int addHouse(HouseList houseList);

    /**
     * 根据房屋的id删除房屋信息
     *
     * @param houseid
     */
    void deleteHouseByHouseId(String houseid);

    /**
     * 根据房子id查询房子信息
     *
     * @param house_id
     * @return
     */
    HouseList findByHouseId(String house_id);

    /**
     * 更新房屋租赁状态信息
     *
     * @param houseList
     */
    void updateHouseStatus(HouseList houseList);

}
