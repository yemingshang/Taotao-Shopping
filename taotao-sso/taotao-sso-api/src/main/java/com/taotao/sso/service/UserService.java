package com.taotao.sso.service;

import com.taotao.common.pojo.E3Result;
import com.taotao.manager.model.TbUser;

/**
 * @author zjs
 * @date 18-11-28 上午9:05
 */


public interface UserService {

    E3Result checkData(String param, Integer type);
    E3Result register(TbUser tbUser);
    E3Result login(String username, String password);
    E3Result getUserByToken(String token);
}
