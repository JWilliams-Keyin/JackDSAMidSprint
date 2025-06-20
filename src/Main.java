import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialize ArrayList of users and scanner
        ArrayList<User> usersArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add sample users and tasks to the array
        User user1 = new User("Bob Kirkland");
        User user2 = new User("Sally Dally");
        User user3 = new User("Jason Noseworthy");

        usersArrayList.add(user1);
        usersArrayList.add(user2);
        usersArrayList.add(user3);

        Task task1 = new Task("Take out the trash");
        Task task2 = new Task("Do the dishes");
        Task task3 = new Task("Mop the floor");
        Task task4 = new Task("Clean the bathroom");
        Task task5 = new Task("Vacuum");
        Task task6 = new Task("Put away groceries");
        Task task7 = new Task("Consolidate debt");


        usersArrayList.get(0).addTaskToUserTasks(task1);
        usersArrayList.get(1).addTaskToUserTasks(task2);
        usersArrayList.get(0).addTaskToUserTasks(task3);
        usersArrayList.get(1).addTaskToUserTasks(task4);
        usersArrayList.get(0).addTaskToUserTasks(task5);
        usersArrayList.get(1).addTaskToUserTasks(task6);
        usersArrayList.get(2).addTaskToUserTasks(task7);

        // Main Program

        boolean runProgram = true;

        while (runProgram) {
            System.out.println("Task Manager");
            System.out.println("Enter the number of the option you wish to choose");
            System.out.println("Options:");
            System.out.println("1. Add a new user");
            System.out.println("2. Print tasks for all users");
            System.out.println("3. Add a task to a user's list");
            System.out.println("4. Complete a task from a user's list");
            System.out.println("5. Quit");

            String optionInput = scanner.next();
            scanner.nextLine();

            if (optionInput.equals("1")) {
                System.out.println(" ");
                System.out.print("Enter the name of the new user: ");
                String newUserName = scanner.nextLine();

                User newUser = new User(newUserName);
                usersArrayList.add(newUser);

                System.out.println("User " + newUserName +  " has been added!");
                System.out.println(" ");
            } else if (optionInput.equals("2")) {
                for (int i = 0; i < usersArrayList.size(); i++) {
                    System.out.println(" ");
                    String userTasks = usersArrayList.get(i).toString();
                    System.out.println(userTasks);
                }
                System.out.println(" ");
            } else if (optionInput.equals("3")) {
                System.out.println(" ");
                System.out.println("Enter the number of the user you would like to access (1, 2, 3, ...):");
                int userIndex = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter the description of the new task:");
                String newTaskDescription = scanner.nextLine();

                Task newTask = new Task(newTaskDescription);
                usersArrayList.get(userIndex - 1).addTaskToUserTasks(newTask);

                System.out.println("New task given!");
                System.out.println(" ");
            } else if (optionInput.equals("4")) {
                System.out.println(" ");
                System.out.println("Enter the number of the user you would like to access (1, 2, 3, ...):");
                int userIndex = scanner.nextInt();
                System.out.println(" ");

                System.out.println("Enter the number of the task you want to complete (1, 2, 3, ...):");
                int taskIndex = scanner.nextInt();
                System.out.println(" ");

                usersArrayList.get(userIndex - 1).markTaskAsComplete(taskIndex - 1);

                System.out.println("Task complete!");
                System.out.println(" ");
            } else if (optionInput.equals("5")) {
                runProgram = false;
            } else {
                System.out.println(" ");
                System.out.println("Please enter a valid number");
                System.out.println(" ");
            }
        }
    }
}
