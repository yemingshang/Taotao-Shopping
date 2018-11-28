package com.taotao.manager.dao;

import com.taotao.manager.model.TbItemParam;
import com.taotao.manager.model.TbItemParamAndName;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 下午4:26
 */


public interface TbItemParamMapper {

    List<TbItemParamAndName> getItemParamList();

    TbItemParam getItemParamByCid(Long cid);

    Integer insertItemParam(TbItemParam tbItemParam);
}
