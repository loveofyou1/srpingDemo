package com.example.demo.application.mapper;

import com.example.demo.application.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sunlei19
 */
@Mapper
public interface UserMapper {
    /**
     * 用户id查询用户信息
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
