package com.taotao.content.service;

import com.taotao.common.pojo.E3Result;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.manager.model.TbContent;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 下午5:10
 */


public interface ContentService {

    E3Result addContent(TbContent content);
    EasyUIDataGridResult getContentListByCategoryId(Long categoryId, int page, int rows);
    List<TbContent> getContentList(Long cid);
}
