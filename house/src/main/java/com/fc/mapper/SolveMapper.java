package com.fc.mapper;

import com.fc.entity.QueryVo;
import com.fc.entity.Solve;
import com.fc.entity.Wrong;

import java.util.List;

/**
 * Description:
 *
 * @author : Juice
 */
public interface SolveMapper {
    /**
     * 加入一条已处理信息
     *
     * @param solve
     */
    void insertSolve(Solve solve);

    /**
     * 查找所有已经解决的信息
     *
     * @param vo
     * @return
     */
    List<Solve> selectAll(QueryVo vo);

    /**
     * 统计消息数量
     *
     * @param vo
     * @return
     */
    Integer selectCount(QueryVo vo);

    /**
     * 删除一条已处理信息
     * @param id
     */
    void deleteSolve(int id);

}
