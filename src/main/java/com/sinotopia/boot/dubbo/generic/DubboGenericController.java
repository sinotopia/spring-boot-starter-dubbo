package com.sinotopia.boot.dubbo.generic;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;


/**
 * @author walkman
 * @date 2017/4/19
 */
@RequestMapping(value = "${spring.dubbo.genericPrefix:/proxy}")
@ResponseBody
public class DubboGenericController {

    @Autowired
    private DubboGenericService dubboGenericProxyService;

    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
    public JsonNode proxy(@RequestBody GenericServiceConfig genericServiceConfig) throws IOException {
        return dubboGenericProxyService.proxy(genericServiceConfig);
    }
}
