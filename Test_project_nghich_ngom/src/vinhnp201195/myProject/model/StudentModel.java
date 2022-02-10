package vinhnp201195.myProject.model;

public class StudentModel extends PersonModel {
    private int idStu;
    private int statusStu;

    public StudentModel(String fullNamePer, int sexPer, String birthPer, int idStu, int statusStu) {
        super(fullNamePer, sexPer, birthPer);
        this.idStu = idStu;
        this.statusStu = statusStu;
    }

    public int getIdStu() {
        return idStu;
    }

    public void setIdStu(int idStu) {
        this.idStu = idStu;
    }

    public int getStatusStu() {
        return statusStu;
    }

    public void setStatusStu(int statusStu) {
        this.statusStu = statusStu;
    }
}
