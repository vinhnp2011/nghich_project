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

    public SubjectModel(int idSubj, String nameSubj, int maxStuSubj) {
        this.idSubj = idSubj;
        this.nameSubj = nameSubj;
        this.maxStuSubj = maxStuSubj;
    }

    public SubjectModel() {
    }

    public int getIdSubj() {
        return idSubj;
    }

    public void setIdSubj(int idSubj) {
        this.idSubj = idSubj;
    }

    public String getNameSubj() {
        return nameSubj;
    }

    public void setNameSubj(String nameSubj) {
        this.nameSubj = nameSubj;
    }

    public int getMaxStuSubj() {
        return maxStuSubj;
    }

    public void setMaxStuSubj(int maxStuSubj) {
        this.maxStuSubj = maxStuSubj;
    }

    public InstructorModel getInstructorModelSubj() {
        return instructorModelSubj;
    }

    public void setInstructorModelSubj(InstructorModel instructorModelSubj) {
        this.instructorModelSubj = instructorModelSubj;
    }

    public ArrayList<StudentModel> getListStudentModelSubj() {
        return listStudentModelSubj;
    }

    public void setListStudentModelSubj(ArrayList<StudentModel> listStudentModelSubj) {
        this.listStudentModelSubj = listStudentModelSubj;
    }

    @Override
    public String toString() {
        return "SubjectModel{" +
                "idSubj=" + idSubj +
                ", nameSubj='" + nameSubj + '\'' +
                ", maxStuSubj=" + maxStuSubj +
                '}';
    }
}
