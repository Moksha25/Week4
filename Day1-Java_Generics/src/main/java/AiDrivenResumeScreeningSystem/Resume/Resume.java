package AiDrivenResumeScreeningSystem.Resume;

import AiDrivenResumeScreeningSystem.JobRole.JobRole;

import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole>
{
    List<T> resumes;

    public Resume(){
        this.resumes = new ArrayList<>();
    }

    public void addResume(T resume){
        resumes.add(resume);
    }

    public List<T> getResumes(){
        return this.resumes;
    }
}
