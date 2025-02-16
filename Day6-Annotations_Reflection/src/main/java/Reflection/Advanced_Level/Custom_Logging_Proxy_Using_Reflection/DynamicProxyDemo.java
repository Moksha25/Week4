package Reflection.Advanced_Level.Custom_Logging_Proxy_Using_Reflection;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();

        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxyHandler(greeting)
        );

        proxyInstance.sayHello("Alice");
    }
}
