package me.pexcn.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pexcn on 2018-08-04.
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String redirectToIndex() {
        return "index";
    }
}
