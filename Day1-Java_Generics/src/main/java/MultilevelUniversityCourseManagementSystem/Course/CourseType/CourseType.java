package MultilevelUniversityCourseManagementSystem.Course.CourseType;

public abstract class CourseType
{
    private EvaluationType evaluationType;
    private String name;
    private int duration;

    public CourseType(EvaluationType evaluationType, String name, int duration)
    {
        this.evaluationType = evaluationType;
        this.name = name;
        this.duration = duration;
    }

    public String getEvaluationType()
    {
        return evaluationType.name();
    }

    public void displayCourseDetails()
    {
        System.out.println("Evaluation type : " + getEvaluationType());
        System.out.println("Name : " + this.name);
        System.out.println("Duration : " + this.duration + " years");
    }

    public String getName()
    {
        return this.name;
    }

    public int getDuration()
    {
        return this.duration;
    }
}
