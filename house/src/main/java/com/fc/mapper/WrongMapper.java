package com.fc.mapper;

import com.fc.entity.QueryVo;
import com.fc.entity.Wrong;

import java.util.List;

/**
 * Description:
 *
 * @author : Juice
 */
public interface WrongMapper {
    /**
     * 查看待处理故障
     *
     * @return
     */
    List<Wrong> findWrong(QueryVo vo);

    /**
     * 通过id查找故障信息
     *
     * @param id 主键id
     * @return
     */
    Wrong findWrongById(int id);

    /**
     * 通过id删除一条待处理故障信息
     */
    void deleteWrongById(int id);
}
