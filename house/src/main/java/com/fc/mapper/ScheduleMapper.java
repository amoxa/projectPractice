package com.fc.mapper;

import com.fc.entity.Schedule;

import java.util.List;

/**
 * Description:
 *
 * @author : Juice
 */
public interface ScheduleMapper {
    /**
     * 添加一条日程
     *
     * @param schedule
     */
    void insertSchedule(Schedule schedule);

    /**
     * 查找所有的日程信息
     *
     * @return
     */
    List<Schedule> selectAll();


}
