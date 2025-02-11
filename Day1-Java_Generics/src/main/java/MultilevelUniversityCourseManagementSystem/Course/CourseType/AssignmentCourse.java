package MultilevelUniversityCourseManagementSystem.Course.CourseType;

public class AssignmentCourse extends CourseType
{
    public AssignmentCourse(String name, int duration)
    {
        super(EvaluationType.ASSIGNMENT_BASED, name, duration);
    }
}
