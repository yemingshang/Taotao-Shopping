package com.taotao.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.common.pojo.E3Result;
import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.content.service.ContentCategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-28 上午8:47
 */

@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

    @Reference
    private ContentCategoryService contentCategoryService;

    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUITreeNode> getContentCatList(
            @RequestParam(value="id", defaultValue="0") Long parentId) {
        return contentCategoryService.getContentCategoryList(parentId);
    }

    @RequestMapping("/create")
    @ResponseBody
    public E3Result createCategory(Long parentId, String name) {
        return contentCategoryService.addContentCategory(parentId, name);
    }

}
