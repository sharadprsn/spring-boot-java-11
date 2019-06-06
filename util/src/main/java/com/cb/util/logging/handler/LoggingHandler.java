package com.cb.util.logging.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class LoggingHandler implements InvocationHandler {
    private static Logger log = LoggerFactory.getLogger(LoggingHandler.class);

    @Override
    public Object invoke(Object target, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        log.info("{}::{}::{}", target.getClass(), method.getName(), System.currentTimeMillis() - start);
        return result;
    }
}
