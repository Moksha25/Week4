package Annotation.Exercise.Create_and_Use_Repeatable_Annotation;

import java.lang.reflect.Method;

public class AnnotationProcessor
{
    public static void main(String[] args) {
        Class<BugTracker> obj = BugTracker.class;

        for (Method method : obj.getDeclaredMethods()) {

            if (method.isAnnotationPresent(BugReport.class) || method.isAnnotationPresent(BugReports.class)) {

                BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);
                System.out.println("Method: " + method.getName());

                for (BugReport report : bugReports) {
                    System.out.println("Description: " + report.description());
                    System.out.println("Reported By: " + report.reportedBy());
                    System.out.println("Date: " + report.date());
                    System.out.println("----------------------");
                }
            }
        }
    }
}
