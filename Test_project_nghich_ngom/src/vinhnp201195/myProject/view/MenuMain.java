package vinhnp201195.myProject.view;

import vinhnp201195.myProject.controller.MenuController;

import java.util.Scanner;

public class MenuMain {

    public void MenuSchoolManagement()
    {
        MenuController menuController = new MenuController();
        Scanner scanner = new Scanner(System.in);
        System.out.print("ban chon gi:");
        int choose = scanner.nextInt();
        while(true)
            switch (choose) {
                case 1:
                    System.out.println("Ban da chon Student");

                case 2:
                    System.out.println("Ban da chon Instructor");
                case 3:
                    System.out.println("Ban da chon Subject");
                case 4:
                    System.out.println("OUT");
            }
    }
}
