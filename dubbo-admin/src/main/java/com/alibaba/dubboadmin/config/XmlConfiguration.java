package com.alibaba.dubboadmin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zjs
 * @date 18-11-28 上午10:56
 */

@Configuration
@ImportResource({"classpath*:dubbo-admin.xml"})
public class XmlConfiguration {
}
