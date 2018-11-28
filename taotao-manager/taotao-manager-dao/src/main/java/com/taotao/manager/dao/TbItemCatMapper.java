package com.taotao.manager.dao;

import com.taotao.manager.model.TbItemCat;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 下午4:25
 */


public interface TbItemCatMapper {

    List<TbItemCat> getItemCatByParentId(long parentId);

    String getItemCatNameById(long id);
}
