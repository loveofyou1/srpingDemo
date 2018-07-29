package com.example.demo.application.dao;

import com.example.demo.application.domain.UserVO;

public interface IUserDao {
    UserVO queryUserById(int id);

    UserVO queryUserInfoByName(String userName);
}
