package AiDrivenResumeScreeningSystem.JobRole.Utils;

import AiDrivenResumeScreeningSystem.JobRole.JobRole;

import java.util.List;

public class JobRoleUtility {
    public static void displayResumeDetails(List<JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayDetails();
        }

    }
}