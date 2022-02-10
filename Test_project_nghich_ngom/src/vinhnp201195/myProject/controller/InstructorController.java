package vinhnp201195.myProject.controller;

import vinhnp201195.myProject.model.SubjectModel;

import java.util.ArrayList;

public class InstructorController implements ControllerInterface{
    ArrayList<SubjectModel> listSubjectModel = new ArrayList<SubjectModel>();

    @Override
    public void Create() {
        System.out.println("Create called");

    }

    @Override
    public void Read() {
        System.out.println("Read called");
    }

    @Override
    public void Update() {
        System.out.println("Update called");
    }

    @Override
    public void Delete() {
        System.out.println("Delete called");
    }
}
