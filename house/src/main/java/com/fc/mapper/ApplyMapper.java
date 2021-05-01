package com.fc.mapper;

import com.fc.entity.Apply;
import com.fc.entity.HouseList;

import java.util.List;

/**
 * Description: 看房申请
 *
 * @author : Juice
 */

public interface ApplyMapper {

    /**
     * 查看所有看房申请
     *
     * @return
     */
    List<Apply> findAllApply();

    /**
     * 根据房屋的id查询查看看房信息
     *
     * @param house_id
     */
    Apply findByHouseId(String house_id);

    /**
     * 根据房屋id删除一条看房申请，表示同意
     *
     * @param house_id
     */
    void deleteByHouseId(String house_id);


    /**
     * 更改租赁状态 和 删除看房申请中的数据
     *
     * @param houseList
     */
    void reFuseApply(HouseList houseList);

    /**
     * 租客 新增看房申请
     */
    void insertApply(Apply apply);

}
