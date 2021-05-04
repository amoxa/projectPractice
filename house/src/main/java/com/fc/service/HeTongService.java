package com.fc.service;

import com.fc.entity.Hetong;
import org.apache.ibatis.annotations.Param;

public interface HeTongService {
    void deleteHeTong(String house_id);

    Hetong findHeTongByHouseId(@Param("house_id") String house_id);
}
