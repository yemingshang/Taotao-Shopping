package com.taotao.order.controller;

/**
 * @author zjs
 * @date 18-11-28 下午2:34
 * 订单管理Controller
 */

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.cart.servcie.CartService;
import com.taotao.common.pojo.E3Result;
import com.taotao.manager.model.TbItem;
import com.taotao.manager.model.TbUser;
import com.taotao.order.pojo.OrderInfo;
import com.taotao.order.service.OrderService;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/order")
public class OrderController {

    @Reference
    private CartService cartService;
    @Reference
    private OrderService orderService;

    /**
     * 跳转订单确认页面
     * @param request
     * @return
     */
    @RequestMapping("/order-cart.html")
    public String showOrderCart(HttpServletRequest request) {
        TbUser user = (TbUser) request.getAttribute("user");
        List<TbItem> cartList = cartService.getCartList(5L);
        request.setAttribute("cartList", cartList);
        return "order-cart";
    }

    @PostMapping("/create.html")
    public String createOrder(OrderInfo orderInfo, HttpServletRequest request) {
        // 1、接收表单提交的数据OrderInfo。
        // 2、补全用户信息。
        TbUser user = (TbUser) request.getAttribute("user");
        orderInfo.setUserId(user.getId());
        orderInfo.setBuyerNick(user.getUsername());
        // 3、调用Service创建订单。
        E3Result result = orderService.createOrder(orderInfo);
        if (result.getStatus() == 200) {
            // 清空购物车
            cartService.clearCartList(user.getId());
        }
        //取订单号
        String orderId = result.getData().toString();
        // a)需要Service返回订单号
        request.setAttribute("orderId", orderId);
        request.setAttribute("payment", orderInfo.getPayment());
        // b)当前日期加三天。
        DateTime dateTime = new DateTime();
        dateTime = dateTime.plusDays(3);
        request.setAttribute("date", dateTime.toString("yyyy-MM-dd"));
        // 4、返回逻辑视图展示成功页面
        return "success";
    }
}
