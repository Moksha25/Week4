package AiDrivenResumeScreeningSystem;

import AiDrivenResumeScreeningSystem.JobRole.DataScientist;
import AiDrivenResumeScreeningSystem.JobRole.JobRole;
import AiDrivenResumeScreeningSystem.JobRole.ProductManager;
import AiDrivenResumeScreeningSystem.JobRole.SoftwareEngineer;
import AiDrivenResumeScreeningSystem.JobRole.Utils.JobRoleUtility;
import AiDrivenResumeScreeningSystem.Resume.Resume;

public class AiDrivenResumeScreeningSystem
{
    public static void main (String args[])
    {
        Resume<JobRole> jobRoleResume = new Resume<>();
        jobRoleResume.addResume(new SoftwareEngineer(70000));
        jobRoleResume.addResume(new SoftwareEngineer(80000));
        jobRoleResume.addResume(new SoftwareEngineer(90000));
        jobRoleResume.addResume(new DataScientist(100000));
        jobRoleResume.addResume(new DataScientist(120000));
        jobRoleResume.addResume(new ProductManager(200000));

        JobRoleUtility.displayResumeDetails(jobRoleResume.getResumes());

    }
}
