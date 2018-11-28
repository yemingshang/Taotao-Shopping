package com.taotao.manager.dao;

import com.taotao.manager.model.TbItemParamItem;

/**
 * @author zjs
 * @date 18-11-27 下午4:26
 */


public interface TbItemParamItemMapper {

    void insert(TbItemParamItem tbItemParamItem);

    TbItemParamItem selectItemParamByItemId(Long itemId);
}
