package com.taotao.order.pojo;

import com.taotao.manager.model.TbOrder;
import com.taotao.manager.model.TbOrderItem;
import com.taotao.manager.model.TbOrderShipping;

import java.io.Serializable;
import java.util.List;

/**
 * @author zjs
 * @date 18-11-28 上午10:03
 */


public class OrderInfo extends TbOrder implements Serializable {

    private List<TbOrderItem> orderItems;
    private TbOrderShipping orderShipping;
    public List<TbOrderItem> getOrderItems() {
        return orderItems;
    }
    public void setOrderItems(List<TbOrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    public TbOrderShipping getOrderShipping() {
        return orderShipping;
    }
    public void setOrderShipping(TbOrderShipping orderShipping) {
        this.orderShipping = orderShipping;
    }

}
