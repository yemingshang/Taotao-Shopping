package com.taotao.cart.servcie;

import com.taotao.common.pojo.E3Result;
import com.taotao.manager.model.TbItem;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-28 上午8:22
 */


public interface CartService {

    E3Result addCart(Long userId, Long itemId, int num);
    E3Result mergeCart(Long userId, List<TbItem> cookieItemList);
    List<TbItem> getCartList(Long userId);
    E3Result updateCartNum(Long userId, Long itemId, int num);
    E3Result deleteCartItem(Long userId, Long itemId);
    E3Result clearCartList(Long userId);
}
