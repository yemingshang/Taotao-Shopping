package com.taotao.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zjs
 * @date 18-11-27 上午11:07
 */

@Data
public class SearchItem implements Serializable {

    private String id;
    private String title;
    private String sell_point;
    private long price;
    private String image;
    private String category_name;
}
