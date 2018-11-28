package com.taotao.search.service;

import com.taotao.common.pojo.SearchResult;

/**
 * @author zjs
 * @date 18-11-27 下午7:17
 */


public interface SearchService {

    SearchResult search(String keyWord, int page, int rows) throws Exception;
}
