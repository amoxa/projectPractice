package com.fc.mapper;

import com.fc.entity.Checkout;

import java.util.List;

/**
 * Description: 被终止的合同
 *
 * @author : Juice
 */
public interface CheckOutMapper {
    /**
     * 添加一条终止合同的记录(退租)
     *
     * @param checkout 终止的合同
     */
    void insertCheckOut(Checkout checkout);

    /**
     * 获取所有合同记录(退租)
     *
     * @return
     */
    List<Checkout> getAllCheckOut();

    /**
     * 通过房屋id删除合同记录
     *
     * @param cid
     */
    void deleteByHouseId(int cid);

}
