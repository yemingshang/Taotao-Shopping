package com.taotao.order.service;

import com.taotao.common.pojo.E3Result;
import com.taotao.order.pojo.OrderInfo;

/**
 * @author zjs
 * @date 18-11-28 上午10:02
 */


public interface OrderService {

    E3Result createOrder(OrderInfo orderInfo);
}
