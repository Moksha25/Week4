package Annotation.Beginner_Level.Create_Annotation_to_Mark_Important_Methods;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the @ImportantMethod annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime for reflection
@Target(ElementType.METHOD) // Can only be used on methods
@interface ImportantMethod {
    String level() default "HIGH"; // Default importance level is HIGH
}
