package com.taotao.content.service;

import com.taotao.common.pojo.E3Result;
import com.taotao.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 下午5:10
 */


public interface ContentCategoryService {

    List<EasyUITreeNode> getContentCategoryList(Long parentId);
    E3Result addContentCategory(long parentId, String name);
}
