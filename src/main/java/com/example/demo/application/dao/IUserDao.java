package com.example.demo.application.dao;

import com.example.demo.application.domain.UserVO;

import java.util.List;

/**
 * @author sunlei19
 */
public interface IUserDao {
    /**
     * 根据用户id查询用户信息
     *
     * @param id
     * @return
     */
    UserVO queryUserById(int id);


    /**
     * 根据用户名查询用户
     *
     * @param userName
     * @return
     */
    UserVO queryUserInfoByName(String userName);


    /**
     * @return
     */
    List<UserVO> list();
}
