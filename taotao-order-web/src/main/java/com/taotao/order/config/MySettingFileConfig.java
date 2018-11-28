package com.taotao.order.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zjs
 * @date 18-11-28 下午2:31
 */

@Configuration
@PropertySource("classpath:conf/conf.properties")
public class MySettingFileConfig {
}
