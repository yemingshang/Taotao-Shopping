package com.taotao.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.common.pojo.E3Result;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.manager.model.TbItem;
import com.taotao.manager.service.TbItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zjs
 * @date 18-11-28 上午8:52
 */

@Controller
@RequestMapping("/item")
public class TbItemController {

    @Reference
    private TbItemService tbItemService;

    @GetMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        return tbItemService.getItemById(itemId);
    }

    @GetMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        EasyUIDataGridResult result = tbItemService.getItemList(page, rows);
        return result;
    }

    @RequestMapping("/save")
    @ResponseBody
    public E3Result saveItem(TbItem item, String desc) {
        E3Result result = tbItemService.addItem(item, desc);
        return result;
    }
}
