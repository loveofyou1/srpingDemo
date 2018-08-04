package com.example.demo.application.service;

import com.example.demo.application.dao.IUserDao;
import com.example.demo.application.domain.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sunlei19
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao iUserDao;

    @Override
    public UserVO queryUserInfoById(int id) {
        return iUserDao.queryUserById(id);
    }

    @Override
    public UserVO queryUserInfoByName(String userName) {
        return iUserDao.queryUserInfoByName(userName);
    }


    @Override
    public List<UserVO> list() {
        return iUserDao.list();
    }
}
