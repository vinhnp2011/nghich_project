package vinhnp201195.myProject.model;

public class InstructorModel extends PersonModel {
    private int idInst;
    private int sexStu;
    private int statusStu;

    public InstructorModel(String fullNamePer, int sexPer, String birthPer, int idInst, int sexStu, int statusStu) {
        super(fullNamePer, sexPer, birthPer);
        this.idInst = idInst;
        this.sexStu = sexStu;
        this.statusStu = statusStu;
    }
}
