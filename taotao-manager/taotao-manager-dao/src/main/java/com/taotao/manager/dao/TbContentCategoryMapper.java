package com.taotao.manager.dao;

import com.taotao.manager.model.TbContentCategory;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 下午4:24
 */


public interface TbContentCategoryMapper {

    List<TbContentCategory> selectTbContentCatsByParentId(Long parentId);

    void insertCategory(TbContentCategory contentCategory);

    TbContentCategory selectTbContentCatById(Long id);

    void updateContentCategoryById(TbContentCategory parentContentCategory);
}
