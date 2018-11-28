package com.taotao.item.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.item.pojo.Item;
import com.taotao.manager.model.TbItem;
import com.taotao.manager.model.TbItemDesc;
import com.taotao.manager.service.TbItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zjs
 * @date 18-11-28 上午11:36
 */

@Controller
public class ItemController {

    @Reference
    private TbItemService itemService;

    @RequestMapping("/item/{itemId}.html")
    public String showItemInfo(@PathVariable Long itemId, Model model) {
        //跟据商品id查询商品信息
        TbItem tbItem = itemService.getItemById(itemId);
        //把TbItem转换成Item对象
        Item item = new Item(tbItem);
        //根据商品id查询商品描述
        TbItemDesc tbItemDesc = itemService.getItemDescById(itemId);
        //把数据传递给页面
        model.addAttribute("item", item);
        model.addAttribute("itemDesc", tbItemDesc);
        return "item";
    }
}
