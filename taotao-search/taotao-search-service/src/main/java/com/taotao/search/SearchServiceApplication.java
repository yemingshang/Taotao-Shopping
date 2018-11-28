package com.taotao.search;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zjs
 * @date 18-11-27 下午8:19
 */

@MapperScan(value = {"com.taotao.manager.dao", "com.taotao.search.dao"})
@SpringBootApplication
public class SearchServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchServiceApplication.class, args);
    }
}
