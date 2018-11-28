package com.taotao.sso.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zjs
 * @date 18-11-28 下午3:06
 */

@Configuration
@PropertySource("classpath:conf/conf.properties")
public class MySettingFileConfig {
}
