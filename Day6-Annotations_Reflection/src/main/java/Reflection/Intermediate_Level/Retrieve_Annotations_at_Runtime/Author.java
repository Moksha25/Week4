package Reflection.Intermediate_Level.Retrieve_Annotations_at_Runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Retain annotation at runtime
@Target(ElementType.TYPE) // Can be applied to classes
@interface Author {
    String name();
}