package com.taotao.manager.dao;

import com.taotao.manager.model.TbItemDesc;

/**
 * @author zjs
 * @date 18-11-27 下午4:25
 */


public interface TbItemDescMapper {
    void insert(TbItemDesc tbItemDesc);

    TbItemDesc selectItemDescByPrimaryKey(Long itemId);
}
