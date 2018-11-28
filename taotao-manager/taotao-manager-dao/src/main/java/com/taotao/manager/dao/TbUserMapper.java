package com.taotao.manager.dao;

import com.taotao.manager.model.TbUser;

import java.util.List;
import java.util.Map;

/**
 * @author zjs
 * @date 18-11-27 下午4:28
 */


public interface TbUserMapper {

    List<TbUser> selectByKey(Map<String, Object> paramMap);

    int insert(TbUser user);

    List<TbUser> selectUserByNameOrPwd(Map<String, Object> paramMap);
}
