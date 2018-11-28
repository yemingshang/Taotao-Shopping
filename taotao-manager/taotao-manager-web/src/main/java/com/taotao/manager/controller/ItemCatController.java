package com.taotao.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.manager.service.ItemCatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-28 上午8:49
 */

@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Reference
    private ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
        List<EasyUITreeNode> list = itemCatService.getCatList(parentId);
        return list;
    }
}
