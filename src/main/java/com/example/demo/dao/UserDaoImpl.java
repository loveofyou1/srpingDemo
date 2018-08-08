package com.example.demo.dao;

import com.example.demo.domain.UserVO;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sunlei19
 */
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


    @Override
    public List<UserVO> getList() {
        return userMapper.getList();
    }
}
