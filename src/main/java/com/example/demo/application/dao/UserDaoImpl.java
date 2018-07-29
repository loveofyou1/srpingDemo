package com.example.demo.application.dao;

import com.example.demo.application.domain.UserVO;
import com.example.demo.application.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserDaoImpl implements IUserDao{

    @Resource
    private UserMapper userMapper;

    @Override
    public UserVO queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public UserVO queryUserInfoByName(String userName) {
        return userMapper.queryUserInfoByName(userName);
    }
}
