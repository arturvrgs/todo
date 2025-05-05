import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> tasks = new ArrayList<String>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       while(true) {
           displayMenu();

           System.out.println("Enter your choice: ");
           int menuChoice = scan.nextInt();
           scan.nextLine();

           if (menuChoice == 1) {
               addTask();
           }

           if (menuChoice == 2) {
               removeTask();
           }

           if (menuChoice == 3) {
               displayTasks();
           }
       }
    }

    public static void removeTask() {
        displayTasks();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the task number to remove: ");
        int removedTask = scan.nextInt();

        if (removedTask < 0 || removedTask >= tasks.size()) {
            System.out.println("Enter a valid task.");
            return;
        }

        tasks.remove(removedTask);
    }

    public static void displayTasks() {

        if(tasks.isEmpty()) {
            System.out.print("Your list is empty.");
            return;
        }

        System.out.println("Tasks:");

        for(int i = 0; i < tasks.size(); i++) {
            System.out.println(i + " - " + tasks.get(i));
        }
    }

    public static void addTask() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your task: ");
        String newTask = scan.nextLine();

        tasks.add(newTask);
    }

    public static void displayMenu() {

        System.out.println("| -------MENU------- |");
        System.out.println("| 1 - Add task       |");
        System.out.println("| 2 - Remove task    |");
        System.out.println("| 3 - Display tasks  |");
        System.out.println("| ------------------ |");

    }
}