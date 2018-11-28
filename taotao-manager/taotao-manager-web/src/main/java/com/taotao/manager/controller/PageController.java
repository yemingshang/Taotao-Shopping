package com.taotao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zjs
 * @date 18-11-28 上午8:50
 */

@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
