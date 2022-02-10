package vinhnp201195.myProject.model;

public class InstructorModel extends PersonModel {
    private int idInst;
    private int statusStu;

    public InstructorModel(String fullNamePer, int sexPer, String birthPer, int idInst, int statusStu) {
        super(fullNamePer, sexPer, birthPer);
        this.idInst = idInst;
        this.statusStu = statusStu;
    }

    public int getIdInst() {
        return idInst;
    }

    public void setIdInst(int idInst) {
        this.idInst = idInst;
    }

    public int getStatusStu() {
        return statusStu;
    }

    public void setStatusStu(int statusStu) {
        this.statusStu = statusStu;
    }
}
