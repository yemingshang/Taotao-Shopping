package com.taotao.manager.service;

import com.taotao.common.pojo.E3Result;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.manager.model.TbItem;
import com.taotao.manager.model.TbItemDesc;

/**
 * @author zjs
 * @date 18-11-27 下午4:39
 */


public interface TbItemService {

    TbItem getItemById(Long itemId);
    EasyUIDataGridResult getItemList(int page, int rows);
    E3Result addItem(TbItem item, String desc);
    TbItemDesc getItemDescById(Long itemId);
}
