package com.taotao.manager.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zjs
 * @date 18-11-27 下午4:09
 */

@Data
public class TbItemDesc implements Serializable {

    private Long itemId;

    private Date created;

    private Date updated;

    private String itemDesc;
}
