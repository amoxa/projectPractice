package com.fc.mapper;

import com.fc.entity.Zulist;

import java.util.List;

/**
 * Description: 在租
 *
 * @author : Juice
 */
public interface ZuListMapper {
    /**
     * 查询租户
     *
     * @return 租户列表集合
     */
    List<Zulist> findZuUserList();

    /**
     * 根据房屋信息查询租赁信息
     *
     * @param house_id 房屋id
     * @return
     */
    Zulist findByHouseId(String house_id);

    /**
     * 删除一条租凭信息
     *
     * @param house_id
     */
    void deleteZuList(String house_id);

    /**
     * 增加一条租户信息
     *
     * @param zulist
     */
    void insertZuList(Zulist zulist);

    /**
     * 通过id查询租户
     *
     * @return
     */
    Zulist findZuUserById(int id);

    List<Zulist> findZuListByuId(int id);
}
