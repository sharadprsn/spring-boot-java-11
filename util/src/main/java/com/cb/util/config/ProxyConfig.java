package com.cb.util.config;

import com.cb.util.logging.TimeTracker;
import com.cb.util.logging.handler.LoggingHandler;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class ProxyConfig {

    public Object newInstance() {
        HashMap obj = new HashMap();
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{TimeTracker.class}, new LoggingHandler());
    }
}
