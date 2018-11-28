package com.taotao.manager.dao;

import com.taotao.manager.model.TbItem;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 下午4:26
 */


public interface TbItemMapper {

    TbItem selectByPrimaryKey(Long id);

    List<TbItem> getItemList();

    void insert(TbItem item);
}
