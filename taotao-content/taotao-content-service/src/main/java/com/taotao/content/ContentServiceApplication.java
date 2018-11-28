package com.taotao.content;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.concurrent.CountDownLatch;


/**
 * @author zjs
 * @date 18-11-27 下午5:18
 */

@MapperScan(value = "com.taotao.manager.dao")
@SpringBootApplication
public class ContentServiceApplication {

    public static void main(String[] args) throws InterruptedException {
        new SpringApplicationBuilder()
                .sources(ContentServiceApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.await();
    }
}
