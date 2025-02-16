package Annotation.Intermediate_Level.Create_MaxLength_Annotation_for_Field_Validation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the @MaxLength annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime for reflection
@Target(ElementType.FIELD) // Can be applied to fields only
@interface MaxLength {
    int value(); // Maximum length allowed
}
