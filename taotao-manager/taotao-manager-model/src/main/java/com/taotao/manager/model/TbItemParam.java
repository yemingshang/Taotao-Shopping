package com.taotao.manager.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zjs
 * @date 18-11-27 下午4:10
 */

@Data
public class TbItemParam implements Serializable {

    private Long id;

    private Long itemCatId;

    private Date created;

    private Date updated;

    private String paramData;
}
