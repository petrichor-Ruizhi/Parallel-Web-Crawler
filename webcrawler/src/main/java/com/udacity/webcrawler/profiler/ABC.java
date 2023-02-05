package com.udacity.webcrawler.profiler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ABC implements InvocationHandler {
    private Object delegate;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(delegate, args);
        return null;
    }
}
