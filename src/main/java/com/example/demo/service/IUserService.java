package com.example.demo.service;

import com.example.demo.domain.UserVO;
import org.apache.catalina.User;

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
    List<UserVO> getList();


    /**
     *
     * @param userVO
     * @return
     */
    Integer save(UserVO userVO);
}
