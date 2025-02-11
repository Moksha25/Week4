package MultilevelUniversityCourseManagementSystem.Course.CourseType.utils;

import MultilevelUniversityCourseManagementSystem.Course.CourseType.CourseType;

import java.util.List;

public class CourseTypeUtility
{
    public static void displayCourseDetails(List<? extends CourseType> courses)
    {
        for (CourseType course : courses)
        {
            course.displayCourseDetails();
        }
    }
}
