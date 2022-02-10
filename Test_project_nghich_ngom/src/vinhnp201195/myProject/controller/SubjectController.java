package vinhnp201195.myProject.controller;

import vinhnp201195.myProject.model.SubjectModel;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class SubjectController implements ControllerInterface {
    ArrayList<SubjectModel> listSubjectModel = new ArrayList<SubjectModel>();
    SubjectModel subjectModel;

    public SubjectModel Catch(SubjectModel subjectModel)
    {
        this.subjectModel = subjectModel;
        return subjectModel;
    }
    @Override
    public void Create() {
        System.out.println("Create called");
        listSubjectModel.add(this.subjectModel);
    }

    @Override
    public void Read() {
        System.out.println("Read called");
        listSubjectModel.forEach( a ->
                System.out.println(a));
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
