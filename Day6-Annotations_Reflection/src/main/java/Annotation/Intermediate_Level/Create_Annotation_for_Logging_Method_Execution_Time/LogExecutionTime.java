package Annotation.Intermediate_Level.Create_Annotation_for_Logging_Method_Execution_Time;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the @LogExecutionTime annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime for reflection
@Target(ElementType.METHOD) // Can be applied to methods only
@interface LogExecutionTime {
}
