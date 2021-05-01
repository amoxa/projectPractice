package com.fc.mapper;

import com.fc.entity.Hetong;

/**
 * Description: 合同相关
 *
 * @author : Juice
 */
public interface HeTongMapper {
    /**
     * 根据房屋id查询合同
     *
     * @param house_id 房屋id
     * @return 合同信息
     */
    Hetong findHeTong(int house_id);

    /**
     * 更新合同
     *
     * @param hetong 合同信息
     */
    void updateHeTong(Hetong hetong);

    /**
     * 删除一条合同:终止合同
     *
     * @param house_id
     */
    void deleteHeTong(String house_id);

    /**
     * 增加一条合同信息
     *
     * @param hetong
     */
    void addHeTong(Hetong hetong);

    /**
     * 根据房屋id查询合同
     *
     * @param house_id
     * @return
     */
    Hetong findHeTongByHouseId(String house_id);


}
