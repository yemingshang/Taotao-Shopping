package com.taotao.manager.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zjs
 * @date 18-11-27 下午4:06
 */

@Data
public class TbContent implements Serializable {

    private Long id;

    private Long categoryId;

    private String title;

    private String subTitle;

    private String titleDesc;

    private String url;

    private String pic;

    private String pic2;

    private Date created;

    private Date updated;

    private String content;
}
