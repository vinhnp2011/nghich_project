package vinhnp201195.myProject.view;

import vinhnp201195.myProject.controller.MenuController;

import java.util.Scanner;

public class MenuView {

    public void Menu() {
        System.out.println("1. Them");
        System.out.println("2. Sua");
        System.out.println("3. Xoa");
        System.out.println("4. Thoat");
        System.out.print("ban chon gi:");
    }

    public void MenuSchoolManagement() {
        MenuController menuController = new MenuController();
        Scanner scanner = new Scanner(System.in);

        int choose;
        while (true) {
            Menu();
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Ban da chon Student");
                    break;

                case 2:
                    System.out.println("Ban da chon Instructor");
                    break;
                case 3:
                    System.out.println("Ban da chon Subject");
                    break;
                case 4:
                    System.out.println("OUT");
                    break;
                default:
                    System.out.println("Wrong choose!!!!!!. Try Again");
                    continue;
            }
            System.out.println("------------------------------------");
            if (choose == 4) {
                System.out.println("thank you!!!!!!!!!!");
                break;
            }
        }
    }
}
