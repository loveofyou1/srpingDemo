package com.example.demo.application.web;

import com.example.demo.application.domain.UserVO;
import com.example.demo.application.service.IUserService;
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
@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;


    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public String list(ModelMap modelMap) {
        List<UserVO> userList = iUserService.list();
        modelMap.addAttribute("userList", userList);
        return "list";
    }
}
