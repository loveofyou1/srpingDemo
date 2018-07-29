package com.example.demo.application.service;

import com.example.demo.application.domain.UserVO;

public interface IUserService {
    UserVO queryUserInfoById(int id);

    UserVO queryUserInfoByName(String userName);
}
