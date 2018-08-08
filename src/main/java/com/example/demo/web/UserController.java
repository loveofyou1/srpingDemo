package com.example.demo.web;

import com.alibaba.fastjson.JSON;
import com.example.demo.domain.UserVO;
import com.example.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author sunlei19
 * @create 2018/8/4
 */
@Slf4j
@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;


    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }


    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public String list(ModelMap modelMap) {
        List<UserVO> userList = iUserService.getList();
        log.info("查询用户列表结果:{}", JSON.toJSONString(userList));
        modelMap.addAttribute("userList", userList);
        return "list";
    }


    @RequestMapping(value = "/user", method = {RequestMethod.GET})
    public String get(ModelMap modelMap) {
        log.info("根据id查询用户信息：{}", 1);
        UserVO userVO = iUserService.queryUserInfoById(1);
        modelMap.addAttribute("user", userVO);
        // modelMap.addAttribute("message", messageSource.getMessage("demo.test", null, Locale.ENGLISH));
        return "userInfo";
    }

}
