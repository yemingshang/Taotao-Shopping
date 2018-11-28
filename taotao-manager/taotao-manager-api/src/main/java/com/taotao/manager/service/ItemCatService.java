package com.taotao.manager.service;

import com.taotao.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 下午4:33
 */


public interface ItemCatService {

    List<EasyUITreeNode> getCatList(Long parentId);
}
