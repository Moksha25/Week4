package Reflection.Advanced_Level.Custom_Logging_Proxy_Using_Reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Logging before method execution
        System.out.println("Logging: Method " + method.getName() + " is called with arguments: " + java.util.Arrays.toString(args));

        // Execute actual method
        return method.invoke(target, args);
    }
}