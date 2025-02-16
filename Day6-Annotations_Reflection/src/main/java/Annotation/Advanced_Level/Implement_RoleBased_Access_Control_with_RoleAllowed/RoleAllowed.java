package Annotation.Advanced_Level.Implement_RoleBased_Access_Control_with_RoleAllowed;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the @RoleAllowed annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD) // Can be applied to methods only
@interface RoleAllowed {
    String value(); // Defines the allowed role (e.g., "ADMIN")
}
