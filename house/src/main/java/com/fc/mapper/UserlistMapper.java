package com.fc.mapper;

import com.fc.entity.Userlist;

import java.util.List;

/**
 * Description:
 *
 * @author : Juice
 */
public interface UserlistMapper {
    /**
     * 查找所有房客
     *
     * @return
     */
    List<Userlist> findAllUserlist();

    void deleteUserById(int id);

    void deleteUserListByUserId(int userId);


    Userlist findUserlist(Integer user_id);

    List<Userlist> getUserzuList(int id);

    List<Userlist> getMyCheckout(int id);

    List<Userlist> getMyApply(int id);

    List<Userlist> getMyApplyOut(int id);

    /**
     * 根据idcard查询用户
     *
     * @param idcard
     * @return
     */
    Userlist checkForIdCard(String idcard);

    void insertUserList(Userlist userlist);
}
