package vinhnp201195.myProject.model;

import java.util.Date;

public class PersonModel {
    private String fullNamePer;
    private int sexPer;
    private String birthPer;

    public PersonModel(String fullNamePer, int sexPer, String birthPer) {
        this.fullNamePer = fullNamePer;
        this.sexPer = sexPer;
        this.birthPer = birthPer;
    }

    public String getFullNamePer() {
        return fullNamePer;
    }

    public void setFullNamePer(String fullNamePer) {
        this.fullNamePer = fullNamePer;
    }

    public int getSexPer() {
        return sexPer;
    }

    public void setSexPer(int sexPer) {
        this.sexPer = sexPer;
    }

    public String getBirthPer() {
        return birthPer;
    }

    public void setBirthPer(String birthPer) {
        this.birthPer = birthPer;
    }
}
