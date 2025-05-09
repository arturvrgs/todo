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
               limpaTela();
               addTask();
               limpaTela();
           }

           if (menuChoice == 2) {
               limpaTela();
               removeTask();
               limpaTela();
           }

           if (menuChoice == 3) {
               limpaTela();
               displayTasks();
           }

           if (menuChoice == 4) {
               limpaTela();
               markAsCompleted();
               limpaTela();
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
            limpaTela();
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

        System.out.println("| ----------MENU---------- |");
        System.out.println("| 1 - Add task             |");
        System.out.println("| 2 - Remove task          |");
        System.out.println("| 3 - Display tasks        |");
        System.out.println("| 4 - Mark completed task  |");
        System.out.println("| ------------------------ |");

    }

    public static void markAsCompleted() {
        displayTasks();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the task you want to mark as completed: ");
        int markedTask = scan.nextInt();

        if (markedTask < 0 || markedTask >= tasks.size()) {
            System.out.println("Enter a valid task.");
            return;
        }
        tasks.set(markedTask, tasks.get(markedTask).concat("  ✔✔"));
    }

    public static void limpaTela() {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }
