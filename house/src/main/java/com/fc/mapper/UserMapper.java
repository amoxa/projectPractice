package com.fc.mapper;

import com.fc.entity.User;

/**
 * Description:
 *
 * @author : Juice
 */
public interface UserMapper {
    /**
     * 根据用户查询是否存在
     *
     * @param user 需要查询的用户信息
     * @return 查询出的用户实体
     */
    User login(User user);

}
