package com.taotao.common.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 上午11:17
 */

@Data
public class SearchResult implements Serializable {

    private List<SearchItem> itemList;
    private int totalPages;
    private int recourdCount;
}
