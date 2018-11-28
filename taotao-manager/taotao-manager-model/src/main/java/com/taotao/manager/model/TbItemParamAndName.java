package com.taotao.manager.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zjs
 * @date 18-11-27 下午4:11
 */

@Data
public class TbItemParamAndName extends TbItemParam implements Serializable {

    private String itemCatName;
}
