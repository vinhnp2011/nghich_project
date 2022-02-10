package vinhnp201195.myProject.controller;

import vinhnp201195.myProject.view.InstructorView;
import vinhnp201195.myProject.view.StudentView;
import vinhnp201195.myProject.view.SubjectView;

public class GeneralMenuController
{
    public void Student()
    {
        StudentView studentView = new StudentView();
        studentView.startMenuStudentView();
    }

    public void Instructor()
    {
        InstructorView instructorView = new InstructorView();
        instructorView.startMenuInstructorView();
    }

    public void Subject()
    {
        SubjectView subjectView = new SubjectView();
        subjectView.startMenuSubjectView();
    }

}
