package com.taotao.portal.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.content.service.ContentService;
import com.taotao.manager.model.TbContent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-28 下午2:45
 */

@Controller
public class IndexController {

    @Value("${CONTENT_BANNER_ID}")
    private Long CONTENT_BANNER_ID;

    @Reference
    private ContentService contentService;

    @RequestMapping({"/index", "/", "index.html"})
    public String showIndex(Model model) {
        List<TbContent> contentList = contentService.getContentList(CONTENT_BANNER_ID);
        model.addAttribute("ad1List", contentList);
        return "index";
    }
}
