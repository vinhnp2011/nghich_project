package vinhnp201195.myProject.view;

import vinhnp201195.myProject.controller.GeneralMenuController;

import java.util.Scanner;

public abstract class MenuBasicView {
    public abstract void Menu();
    public abstract void GeneralMenu();
    public abstract void GeneralMenuChoose();

//    public void Menu()
//    {
//        System.out.println("1. Them");
//        System.out.println("2. Sua");
//        System.out.println("3. Xoa");
//        System.out.println("4. Thoat");
//    }
//
//    public void GeneralMenu(String menuString_1, String menuString_2, String menuString_3)
//    {
//        System.out.println("1. thao tac voi " + menuString_1);
//        System.out.println("2. thao tac voi " + menuString_2);
//        System.out.println("3. thao tac voi " + menuString_3);
//        System.out.println("4. Thoat");
//    }
//
//    public void GeneralMenuChoose(String menuString_1, String menuString_2, String menuString_3) {
//        System.out.print("ban chon gi:");
//        GeneralMenuController generalMenuController = new GeneralMenuController();
//        Scanner scanner = new Scanner(System.in);
//        int choose;
//        String string1 = new String("--> Ban da chon: ");
//        while (true)
//        {
//            choose = scanner.nextInt();
//            Menu();
//            switch (choose) {
//                case 1:
//                    System.out.println( string1 + menuString_1);
//
//                    break;
//                case 2:
//                    System.out.println( string1 + menuString_2);
//
//                    break;
//                case 3:
//                    System.out.println( string1 + menuString_3);
//                    generalMenuController.Subject();
//                    break;
//                case 4:
//                    System.out.println("OUT");
//
//                    break;
//                default:
//                    System.out.println("------------Wrong number!!!!!!. Try Again------------");
//                    continue;
//            }
//            System.out.println("------------------------------------");
//            if (choose == 4) {
//                System.out.println("thank you!!!!!!!!!!");
//                break;
//            }
//        }
//    }

}
