package com.alibaba.boot.dubbo;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author walkman
 * @date 2017/4/19
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(value = {DubboProxyConfiguration.class})
@EnableDubboAutoConfiguration
@EnableZuulProxy
public @interface EnableDubboProxy {

}
