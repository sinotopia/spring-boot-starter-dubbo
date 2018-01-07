package com.alibaba.boot.dubbo;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author walkman
 * @date 2017/4/19
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(value = {DubboAutoConfiguration.class, DubboClientsRegistrar.class})
public @interface EnableDubboAutoConfiguration {

}
