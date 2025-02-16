package Reflection.Advanced_Level.Dependency_Injection_using_Reflection;

class Client {
    @Inject
    private Service service;

    public void doWork() {
        service.execute();
    }
}