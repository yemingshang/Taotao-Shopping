package com.taotao.manager.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zjs
 * @date 18-11-27 下午4:19
 */

@Data
public class TbUser implements Serializable {

    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Date created;

    private Date updated;
}
