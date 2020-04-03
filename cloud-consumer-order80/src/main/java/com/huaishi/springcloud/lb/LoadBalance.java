package com.huaishi.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Created by huaishi on 2020/4/3
 */
public interface LoadBalance {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
