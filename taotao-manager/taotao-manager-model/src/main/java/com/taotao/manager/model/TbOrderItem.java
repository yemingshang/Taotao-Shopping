package com.taotao.manager.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zjs
 * @date 18-11-27 下午4:17
 */

@Data
public class TbOrderItem implements Serializable {

    private String id;

    private String itemId;

    private String orderId;

    private Integer num;

    private String title;

    private Long price;

    private Long totalFee;

    private String picPath;
}
