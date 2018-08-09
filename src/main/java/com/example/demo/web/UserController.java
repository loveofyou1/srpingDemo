package com.example.demo.web;

import com.alibaba.fastjson.JSON;
import com.example.demo.domain.UserVO;
import com.example.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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


    /**
     * 打开首页
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }


    /**
     * 查询用户列表
     *
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public String list(ModelMap modelMap) {
        List<UserVO> userList = iUserService.getList();
        log.info("查询用户列表结果:{}", JSON.toJSONString(userList));
        modelMap.addAttribute("userList", userList);
        return "list";
    }


    /**
     * 查询某一个用户
     *
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/user", method = {RequestMethod.GET})
    public String get(ModelMap modelMap) {
        log.info("根据id查询用户信息：{}", 1);
        UserVO userVO = iUserService.queryUserInfoById(1);
        modelMap.addAttribute("user", userVO);
        // modelMap.addAttribute("message", messageSource.getMessage("demo.test", null, Locale.ENGLISH));
        return "userInfo";
    }


    /**
     * 打开form页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/form", method = {RequestMethod.GET})
    public String form(Model model) {

        UserVO userVO = iUserService.queryUserInfoById(1);
        model.addAttribute("userVO", userVO);
        return "form";
    }


    /**
     * 保存新用户信息
     *
     * @param userVO
     * @param result
     * @return
     */
    @RequestMapping(value = "/saveUser", method = {RequestMethod.POST})
    public String save(@ModelAttribute("userVO") UserVO userVO, BindingResult result) {
        log.info("保存用户信息:{}", JSON.toJSONString(userVO));
        if (userVO != null && userVO.getUserName() != null) {
            try {
                Integer insertFlag = iUserService.save(userVO);
                log.info("保存用户信息成功:{},更新数：{}", JSON.toJSONString(userVO), insertFlag);
            } catch (Exception e) {
                log.error("保存用户信息出错：{}", JSON.toJSONString(userVO), e);
            }
        }
        return "index";
    }


}
