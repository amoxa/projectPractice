package com.fc.mapper;

import com.fc.entity.Paid;
import com.fc.entity.QueryVo;
import com.fc.entity.Topaid;
import com.fc.entity.Zulist;

import java.util.List;

/**
 * Description:
 *
 * @author : Juice
 */
public interface PaidMapper {

    List<Paid> selectAll(QueryVo vo);

    Double selectSum(QueryVo vo);

}
