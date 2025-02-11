package Ai_Driven_Resume_Screening_System;

import AiDrivenResumeScreeningSystem.JobRole.JobRole;
import AiDrivenResumeScreeningSystem.JobRole.SoftwareEngineer;
import AiDrivenResumeScreeningSystem.Resume.Resume;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AiDrivenResumeScreeningSystemTest
{
    @Test
    void testResumeScreeningSystem(){
        // arrange
        int softwareEngSalary = 100000;

        // act
        Resume<JobRole> jobRoleResume = new Resume<>();
        jobRoleResume.addResume(new SoftwareEngineer(softwareEngSalary));

        // assertion
        List<JobRole> resumes = jobRoleResume.getResumes();
        Assertions.assertEquals(1, resumes.size());
        Assertions.assertEquals(softwareEngSalary, resumes.get(0).getSalary());
    }
}
