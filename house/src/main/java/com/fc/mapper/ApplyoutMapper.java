package com.fc.mapper;

import com.fc.entity.Applyout;

import java.util.List;

/**
 * Description:
 *
 * @author : Juice
 */
public interface ApplyoutMapper {
    /**
     * 查询所有退租申请
     *
     * @return
     */
    List<Applyout> findAllApplyOut();

    /**
     * 根据Id查询退款申请
     *
     * @param id
     * @return
     */
    Applyout findById(Integer id);

    /**
     * 更新退款申请信息
     *
     * @param applyout
     */
    void updateApplyoutByHouse(Applyout applyout);

    /**
     * 删除退款申请
     *
     * @param id
     */
    void deleteApplyout(int id);

    /**
     * 拒绝退款申请
     *
     * @param applyout 退款申请记录id
     */
    void updateApplyoutById(Applyout applyout);
}
