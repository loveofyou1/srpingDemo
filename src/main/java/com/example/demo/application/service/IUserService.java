package com.example.demo.application.service;

import com.example.demo.application.domain.UserVO;

import java.util.List;

/**
 * @author sunlei19
 */
public interface IUserService {
    /**
     * 根据用户id查询用户信息
     *
     * @param id
     * @return
     */
    UserVO queryUserInfoById(int id);


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
