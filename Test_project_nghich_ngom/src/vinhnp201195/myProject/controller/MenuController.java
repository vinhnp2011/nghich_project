package vinhnp201195.myProject.controller;

import vinhnp201195.myProject.view.InstructorView;
import vinhnp201195.myProject.view.StudentView;
import vinhnp201195.myProject.view.SubjectView;

public class MenuController
{
    public void Student()
    {
        StudentView studentView = new StudentView();
        studentView.Menu();
    }

    public void Instructor()
    {
        InstructorView instructorView = new InstructorView();
        instructorView.Menu();
    }

    public void Subject()
    {
        SubjectView subjectView = new SubjectView();
        subjectView.Menu();
    }

}
