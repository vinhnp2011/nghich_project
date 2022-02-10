package vinhnp201195.myProject.view;

import vinhnp201195.myProject.controller.GeneralMenuController;

import java.util.Scanner;

public class GeneralMenuView extends MenuBasicView {
    String menuString_1, menuString_2, menuString_3;
    int choose;
    GeneralMenuController generalMenuController = new GeneralMenuController();

    public void startMenu()
    {
        GeneralMenuChoose();
    }

    @Override
    public void Menu() {
        GeneralMenu();
    }

    @Override
    public void GeneralMenu() {
        System.out.println("--------------------- Main Menu  ---------------------");
        System.out.println("1. thao tac voi Student");
        System.out.println("2. thao tac voi Subject");
        System.out.println("3. thao tac voi Instructor");
        System.out.println("4. Thoat");
        System.out.println("------------------------------------------------------");
        System.out.print("Ban chon cai nao:");
    }

    public void BackNotification()
    {
        System.out.println("-----------------------");
        System.out.println("| Da tro ve Main Menu |");
        System.out.println("-----------------------");
    }
    public void WrongNotification()
    {
        System.out.println("-------------Wrong number!!!!!!.Try Again-------------");
        System.out.println("------------------------------------------------------");
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
                    System.out.println(string1 + "Student");
                    generalMenuController.Student();
                    BackNotification();
                    break;
                case 2:
                    System.out.println(string1 + "Subject");
                    generalMenuController.Subject();
                    BackNotification();
                    break;
                case 3:
                    System.out.println(string1 + "Instructor");
                    generalMenuController.Instructor();
                    BackNotification();
                    break;
                case 4:
                    break;
                default:
                    WrongNotification();
                    continue;
            }
            if (choose == 4) {
                System.out.println("thank you!!!!!!!!!!");
                break;
            }
        }
    }
}
