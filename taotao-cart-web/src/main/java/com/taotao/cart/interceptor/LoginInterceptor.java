package com.taotao.cart.interceptor;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.common.pojo.E3Result;
import com.taotao.common.utils.CookieUtils;
import com.taotao.manager.model.TbUser;
import com.taotao.sso.service.UserService;
import org.aopalliance.intercept.Interceptor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zjs
 * @date 18-11-28 上午9:26
 *
 * 自定义拦截器
 */

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Reference
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1、从Cookie中取出token
        String e3_token = CookieUtils.getCookieValue(request, "E3_TOKEN");
        // 2、没有token，直接放行
        if (StringUtils.isBlank(e3_token)) {
            return true;
        }
        // 3、取到token，调用sso服务取出user信息
        E3Result e3Result = userService.getUserByToken(e3_token);
        // 4、没有用户信息直接放行
        if (e3Result.getStatus() != 200) {
            return true;
        }
        // 5、存在用户信息，则保存至request中
        request.setAttribute("user", (TbUser) e3Result.getData());
        return true;
    }
}
