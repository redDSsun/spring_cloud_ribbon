package com.sys.ribbonconsumer.rules;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

public class MyRule implements IRule {


    @Override
    public Server choose(Object key) {
        return null;
    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {

    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return null;
    }
}
