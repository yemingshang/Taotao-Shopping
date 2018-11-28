package com.taotao.search.dao;

import com.taotao.common.pojo.SearchItem;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 下午8:13
 */


public interface SearchItemMapper {

    List<SearchItem> getItemList();

    SearchItem getItemById(Long itemId);
}
