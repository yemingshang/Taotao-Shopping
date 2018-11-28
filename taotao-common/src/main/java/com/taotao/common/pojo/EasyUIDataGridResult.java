package com.taotao.common.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 上午11:05
 */

@Data
public class EasyUIDataGridResult implements Serializable {

    private Long total;

    private List<?> rows;
}
