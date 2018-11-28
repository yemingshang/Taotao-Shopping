package com.taotao.manager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zjs
 * @date 18-11-28 上午8:45
 */

@Configuration
@PropertySource("classpath:conf/conf.properties")
public class MySettingFileConfig {
}
