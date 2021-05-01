package com.fc.mapper;

import com.fc.entity.QueryVo;
import com.fc.entity.Topaid;

import java.util.List;

/**
 * Description:
 *
 * @author : Juice
 */
public interface TopaidMapper {
    /***
     * 添加一条待交信息
     * @param topaid
     */
    void insertToPaid(Topaid topaid);

    List<Topaid> findTopaid(QueryVo vo);
}
