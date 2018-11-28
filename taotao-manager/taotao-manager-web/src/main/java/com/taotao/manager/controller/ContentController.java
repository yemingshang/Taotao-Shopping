package com.taotao.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.common.pojo.E3Result;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.content.service.ContentService;
import com.taotao.manager.model.TbContent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zjs
 * @date 18-11-28 上午8:48
 */

@Controller
@RequestMapping("/content")
public class ContentController {

    @Reference
    private ContentService contentService;

    @ResponseBody
    @RequestMapping("/query/list")
    public EasyUIDataGridResult getContentListByCategoryId(Long categoryId, Integer page, Integer rows) {
        return contentService.getContentListByCategoryId(categoryId, page, rows);
    }

    @RequestMapping("/save")
    @ResponseBody
    public E3Result addContent(TbContent content) {
        return contentService.addContent(content);
    }
}
