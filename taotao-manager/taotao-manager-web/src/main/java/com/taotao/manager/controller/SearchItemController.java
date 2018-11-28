package com.taotao.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.common.pojo.E3Result;
import com.taotao.search.service.SearchItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zjs
 * @date 18-11-28 上午8:52
 */

@Controller
public class SearchItemController {

    @Reference(timeout = 300000)
    private SearchItemService searchItemService;

    @RequestMapping("/index/item/import")
    @ResponseBody
    public E3Result impotItemIndex() {
        E3Result result = searchItemService.importItems();
        return result;
    }
}
