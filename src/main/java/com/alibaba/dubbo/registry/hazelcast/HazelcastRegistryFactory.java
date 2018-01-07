package com.alibaba.dubbo.registry.hazelcast;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.registry.Registry;
import com.alibaba.dubbo.registry.support.AbstractRegistryFactory;

/**
 * @author walkman
 * @date 2017/4/19
 */
public class HazelcastRegistryFactory extends AbstractRegistryFactory {

    @Override
    protected Registry createRegistry(URL url) {
        return new HazelcastRegistry(url);
    }
}
