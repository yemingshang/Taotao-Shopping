package com.taotao.sso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.concurrent.CountDownLatch;

/**
 * @author zjs
 * @date 18-11-28 上午9:16
 */

@MapperScan(value = "com.taotao.manager.dao")
@SpringBootApplication
public class SsoServiceApplication {

    public static void main(String[] args) throws InterruptedException {
        new SpringApplicationBuilder()
                .sources(SsoServiceApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.await();
    }
}
