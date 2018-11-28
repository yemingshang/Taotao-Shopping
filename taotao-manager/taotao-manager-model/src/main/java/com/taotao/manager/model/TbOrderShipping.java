package com.taotao.manager.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zjs
 * @date 18-11-27 下午4:18
 */

@Data
public class TbOrderShipping implements Serializable {

    private String orderId;

    private String receiverName;

    private String receiverPhone;

    private String receiverMobile;

    private String receiverState;

    private String receiverCity;

    private String receiverDistrict;

    private String receiverAddress;

    private String receiverZip;

    private Date created;

    private Date updated;
}
