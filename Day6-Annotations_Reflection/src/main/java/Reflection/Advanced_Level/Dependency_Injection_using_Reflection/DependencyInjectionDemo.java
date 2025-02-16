package Reflection.Advanced_Level.Dependency_Injection_using_Reflection;

public class DependencyInjectionDemo {
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();

        Client client = container.getInstance(Client.class);

        client.doWork();
    }
}