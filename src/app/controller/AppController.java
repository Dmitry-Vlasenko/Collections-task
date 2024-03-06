package app.controller;

import app.entity.User;
import app.model.CollectionsTask;

import java.util.Scanner;

public class AppController {
    //    Text for menu
    private static final String menu = """
            --------------
            Select action:
            --------------
            1) Show all users
            2) Show users by index
            3) stop and exit
            """;

    public void Processing() {
//        Init scanner
       Scanner scanner = new Scanner(System.in);
//        Set users in list
        CollectionsTask task = new CollectionsTask();
        task.addUser(new User("John", "john@gmail.com"));
        task.addUser(new User("Alice", "alice@gmail.com"));
        task.addUser(new User("Bob", "bob@gmail.com"));
        task.addUser(new User("Emma", "emma@gmail.com"));
        task.addUser(new User("Michael", "michael@gmail.com"));
//Work with menu
        while (true) {
            System.out.println(menu);
            System.out.print("Input your select: ");
            String action = scanner.nextLine();
            switch (action) {
//                Output all users
                case "1":
                    task.printUsers();
                    break;
//                    Output user by index
                case "2":
                    System.out.println("Write index by user");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    User user = task.getUserAtIndex(index);
                    if (user != null) {
                        System.out.println("\nUser by index " + index + ":");
                        System.out.println(user);
                    } else {
                        System.out.println("\nUser by index " + index + " not found");
                    }
                    break;
//                    exit
                case "3":
                    scanner.close();
                    System.out.println("By-by");
                    return;
//                    Wrong selection
                default:
                    System.out.println("Wrong selection");
                    break;
            }
        }

    }
}
