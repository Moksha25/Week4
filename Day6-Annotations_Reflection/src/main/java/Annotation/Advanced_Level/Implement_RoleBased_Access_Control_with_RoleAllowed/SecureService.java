package Annotation.Advanced_Level.Implement_RoleBased_Access_Control_with_RoleAllowed;

import java.lang.reflect.Method;

public class SecureService {
    @RoleAllowed("ADMIN") // Only ADMIN users can access this method
    public void restrictedMethod() {
        System.out.println("Access Granted! Executing restricted method...");
    }

    // Method to check access and invoke the method if allowed
    public void executeRestrictedMethod(User user) {
        try {
            Method method = this.getClass().getMethod("restrictedMethod");

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                String requiredRole = method.getAnnotation(RoleAllowed.class).value();

                if (user.getRole().equalsIgnoreCase(requiredRole)) {
                    method.invoke(this);
                } else {
                    System.out.println("Access Denied! You must be an " + requiredRole + " to execute this method.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
