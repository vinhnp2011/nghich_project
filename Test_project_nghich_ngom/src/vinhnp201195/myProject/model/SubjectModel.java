package vinhnp201195.myProject.model;

import java.util.ArrayList;

public class SubjectModel {
    private int idSubj;
    private String nameSubj;
    private int maxStuSubj;

    private InstructorModel instructorModelSubj;
    private ArrayList<StudentModel> listStudentModelSubj = new ArrayList<StudentModel>();

    public SubjectModel(int idSubj,
                        String nameSubj,
                        int maxStuSubj,
                        InstructorModel instructorModelSubj,
                        ArrayList<StudentModel> listStudentModelSubj) {
        this.idSubj = idSubj;
        this.nameSubj = nameSubj;
        this.maxStuSubj = maxStuSubj;
        this.instructorModelSubj = instructorModelSubj;
        this.listStudentModelSubj = listStudentModelSubj;
    }
}
