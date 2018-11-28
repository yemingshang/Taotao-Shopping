package com.taotao.manager.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zjs
 * @date 18-11-27 下午4:12
 */

@Data
public class TbItemParamItem implements Serializable {

    private Long id;

    private Long itemId;

    private Date created;

    private Date updated;

    private String paramData;
}
