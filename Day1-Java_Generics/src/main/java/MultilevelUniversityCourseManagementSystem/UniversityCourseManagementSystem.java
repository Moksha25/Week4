package MultilevelUniversityCourseManagementSystem;

import MultilevelUniversityCourseManagementSystem.Course.Course;
import MultilevelUniversityCourseManagementSystem.Course.CourseType.AssignmentCourse;
import MultilevelUniversityCourseManagementSystem.Course.CourseType.CourseType;
import MultilevelUniversityCourseManagementSystem.Course.CourseType.ExamCourse;
import MultilevelUniversityCourseManagementSystem.Course.CourseType.utils.CourseTypeUtility;

public class UniversityCourseManagementSystem
{
    public static void main (String args[])
    {
        Course<ExamCourse> exam = new Course<ExamCourse>();
        exam.addCourse(new ExamCourse("B.tech", 4));
        exam.addCourse(new ExamCourse("BCA", 3));
        CourseTypeUtility.displayCourseDetails(exam.getCourses());

        Course<AssignmentCourse> assignment = new Course<>();
        assignment.addCourse(new AssignmentCourse("Java full stack", 1));
        assignment.addCourse(new AssignmentCourse("Web development", 1));
        CourseTypeUtility.displayCourseDetails(assignment.getCourses());

        Course<CourseType> c = new Course<>();
        c.addCourse(new AssignmentCourse("Java full stack", 1));
        c.addCourse(new ExamCourse("BCA", 3));
        CourseTypeUtility.displayCourseDetails(c.getCourses());
    }
}
