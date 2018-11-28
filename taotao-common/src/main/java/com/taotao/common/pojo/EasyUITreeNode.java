package com.taotao.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zjs
 * @date 18-11-27 上午11:06
 */

@Data
public class EasyUITreeNode implements Serializable {

    private long id;
    private String text;
    private String state;
}
