package vinhnp201195.myProject.view;

import vinhnp201195.myProject.controller.SubjectController;
import vinhnp201195.myProject.model.SubjectModel;

import java.util.Scanner;

public class SubjectView extends MenuBasicView {
    SubjectController subjectController = new SubjectController();
    int choose;

    public void startMenuSubjectView() {
        GeneralMenuChoose();
    }

    @Override
    public void Menu() {
        GeneralMenu();
    }

    @Override
    public void GeneralMenu() {
        System.out.println("-------------Menu Subject-------------");
        System.out.println("1. Them");
        System.out.println("2. Sua");
        System.out.println("3. Xuat");
        System.out.println("4. Xoa");
        System.out.println("5. Quay tro lai");
        System.out.println("--------------------------------------");
        System.out.print("Ban chon cai nao:");
    }

    @Override
    public void GeneralMenuChoose() {
        String string1 = new String("--> Ban da chon: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(string1 + "Them");
                    SubjectModel subjectModel = addSubject();
                    subjectController.Catch(subjectModel);
                    subjectController.Create();
                    break;
                case 2:
                    System.out.println(string1 + "Sua");
                    subjectController.Update();
                    break;
                case 3:
                    System.out.println(string1 + "Xuat");
                    subjectController.Read();
                    break;
                case 4:
                    System.out.println(string1 + "Xoa");
                    subjectController.Delete();
                    break;
                case 5:
                    System.out.println(string1 + "Quay tro lai");
                    break;
                default:
                    System.out.println("------------Wrong number!!!!!!. Try Again------------");
                    continue;
            }
            if (choose == 5) {
                break;
            }
        }
    }

    private SubjectModel addSubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID mon hoc:");
        int idSubjView = scanner.nextInt();
        String c = scanner.nextLine();
        System.out.println("Ten mon:");
        String nameSubjView = scanner.nextLine();
        System.out.println("So hoc sinh toi da:");
        int maxStuSubjView = scanner.nextInt();
        SubjectModel subjectModel = new SubjectModel(idSubjView, nameSubjView, maxStuSubjView);
        return subjectModel;
    }
}
