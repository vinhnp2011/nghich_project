package vinhnp201195.myProject.controller;

import vinhnp201195.myProject.model.SubjectModel;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectController implements ControllerInterface{
    ArrayList<SubjectModel> listSubjectModel = new ArrayList<SubjectModel>();

    @Override
    public void Create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("....Nhap ten:");
        String nameStu = scanner.nextLine();
        System.out.println("....Nhap gioi tinh:");
        int sexStu = scanner.nextInt();
        System.out.println("....Nhap ngay thang nam sinh:");
        String birthStu = scanner.nextLine();

    }

    @Override
    public void Read() {

    }

    @Override
    public void Update() {

    }

    @Override
    public void Delete() {

    }
}
