package MultilevelUniversityCourseManagementSystem.Course;

import MultilevelUniversityCourseManagementSystem.Course.CourseType.CourseType;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType>
{
    List<T> courses;

    public Course()
    {
        this.courses = new ArrayList<>();
    }

    public void addCourse(T course)
    {
        courses.add(course);
    }

    public List<T> getCourses()
    {
        return courses;
    }
}
