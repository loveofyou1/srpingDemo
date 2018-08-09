package com.example.demo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

/**
 * @author sunlei19
 * @create 2018/8/8
 */
@Slf4j
@Controller
public class TestController {

    @Autowired
    private MessageSource messageSource;


    @RequestMapping(value = "/")
    public String test(ModelMap model) {
        Locale locale = LocaleContextHolder.getLocale();
        model.addAttribute("hello", messageSource.getMessage("hello", null, locale));
        return "index";
    }


    @RequestMapping(value = "/image", method = {RequestMethod.GET})
    public String image() {
        return "image";
    }
}
