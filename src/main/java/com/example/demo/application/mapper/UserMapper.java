package com.example.demo.application.mapper;

import com.example.demo.application.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserVO queryUserById(int id);

    UserVO queryUserInfoByName(String userName);
}
