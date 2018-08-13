package com.example.demo.web;

import com.example.demo.domain.OneLayer;
import com.example.demo.domain.TwoLayer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
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


    @RequestMapping(value = "/doubleForList", method = {RequestMethod.GET, RequestMethod.POST})
    public String doubleList(Model model) {
        OneLayer data = new OneLayer();
        List<TwoLayer> twoLayers = new ArrayList<>();

        TwoLayer two = new TwoLayer();
        two.setId(1);
        two.setAttr("hello1");
        twoLayers.add(two);

        TwoLayer two1 = new TwoLayer();
        two1.setId(2);
        two1.setAttr("hello2");
        twoLayers.add(two1);

        data.setOneId(1);
        data.setTwoLayer(twoLayers);

        model.addAttribute("data", data);
        return "doubleForList";
    }
}
