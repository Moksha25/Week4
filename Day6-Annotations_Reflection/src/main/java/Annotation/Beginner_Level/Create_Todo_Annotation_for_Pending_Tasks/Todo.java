package Annotation.Beginner_Level.Create_Todo_Annotation_for_Pending_Tasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the @Todo annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime for reflection
@Target(ElementType.METHOD) // Can only be applied to methods
@interface Todo {
    String task(); // Description of the task
    String assignedTo(); // Developer responsible
    String priority() default "MEDIUM"; // Default priority level
}
