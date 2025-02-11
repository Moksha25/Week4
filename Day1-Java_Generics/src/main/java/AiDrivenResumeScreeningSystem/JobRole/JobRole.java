package AiDrivenResumeScreeningSystem.JobRole;

public abstract class JobRole
{
    private JobRoleName name;
    private int salary;

    public JobRole(JobRoleName name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Job role name "+name.name());
        System.out.println("Salary : " + this.salary);
    }

    public int getSalary(){
        return this.salary;
    }
}
