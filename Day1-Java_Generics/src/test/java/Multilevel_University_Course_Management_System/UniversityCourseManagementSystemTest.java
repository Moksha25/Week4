package Multilevel_University_Course_Management_System;

import MultilevelUniversityCourseManagementSystem.Course.Course;
import MultilevelUniversityCourseManagementSystem.Course.CourseType.AssignmentCourse;
import MultilevelUniversityCourseManagementSystem.Course.CourseType.CourseType;
import MultilevelUniversityCourseManagementSystem.Course.CourseType.ExamCourse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UniversityCourseManagementSystemTest
{
    @Test
    void testCoursePlan(){
        // arrange
        String assignmentCourseName = "python course";
        String examCourseName = "btech";
        int assignmentCourseDuration = 1;
        int examCourseDuration = 4;

        // act
        Course<CourseType> course = new Course<>();
        course.addCourse(new AssignmentCourse(assignmentCourseName, assignmentCourseDuration));
        course.addCourse(new ExamCourse(examCourseName, examCourseDuration));

        // assertion
        List<CourseType> courses = course.getCourses();
        Assertions.assertEquals(2, courses.size());
        Assertions.assertEquals(assignmentCourseName, courses.get(0).getName());
        Assertions.assertEquals(assignmentCourseDuration, courses.get(0).getDuration());
        Assertions.assertEquals(examCourseName, courses.get(1).getName());
        Assertions.assertEquals(examCourseDuration, courses.get(1).getDuration());
    }
}
