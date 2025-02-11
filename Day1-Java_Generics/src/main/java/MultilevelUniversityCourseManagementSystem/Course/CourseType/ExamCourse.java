package MultilevelUniversityCourseManagementSystem.Course.CourseType;

public class ExamCourse extends CourseType
{
    public ExamCourse(String name, int duration)
    {
        super(EvaluationType.EXAM_BASED, name, duration);
    }
}
