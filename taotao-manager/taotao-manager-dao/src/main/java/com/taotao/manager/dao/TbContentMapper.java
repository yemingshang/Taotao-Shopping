package com.taotao.manager.dao;

import com.taotao.manager.model.TbContent;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 下午4:24
 */


public interface TbContentMapper {

    List<TbContent> getContentListByCategoryId(Long categoryId);

    List<TbContent> getAllContentList();

    void insertContent(TbContent tbContent);
}
