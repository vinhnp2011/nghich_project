package vinhnp201195.myProject.model;

public class StudentModel extends PersonModel{
    private int idStu;
    private int sexStu;
    private int statusStu;

    public StudentModel(String fullNamePer,
                        int sexPer,
                        String birthPer,
                        int idStu,
                        int sexStu,
                        int statusStu) {
        super(fullNamePer, sexPer, birthPer);
        this.idStu = idStu;
        this.sexStu = sexStu;
        this.statusStu = statusStu;
    }
}
