package Annotation.Advanced_Level.Implement_Custom_Serialization_Annotation_JsonField;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the @JsonField annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.FIELD) // Can be applied to fields only
@interface JsonField {
    String name(); // Defines the JSON key name
}
