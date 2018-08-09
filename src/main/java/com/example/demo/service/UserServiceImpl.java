package com.example.demo.service;

import com.example.demo.dao.IUserDao;
import com.example.demo.domain.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sunlei19
 */
@Slf4j
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
    public List<UserVO> getList() {
        log.info("查询用户列表服务======");
        return iUserDao.getList();
    }


    @Override
    public Integer save(UserVO userVO) {
        return iUserDao.save(userVO);
    }
}
