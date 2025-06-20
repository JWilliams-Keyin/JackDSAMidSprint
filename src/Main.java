import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Initialize ArrayList of users
        ArrayList<User> usersArrayList = new ArrayList<>();

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

        usersArrayList.get(0).addTaskToUserTasks(task1);
        usersArrayList.get(1).addTaskToUserTasks(task2);
        usersArrayList.get(2).addTaskToUserTasks(task3);

        // Main Program

        while (true) {
            System.out.println("Task Manager");
            System.out.println("Options:");
            System.out.println("1. Add a new user");
            System.out.println("2. Print tasks for all users");
            System.out.println("3. Add a task to a user's list");
            System.out.println("4. Complete a task from a user's list");
            System.out.println("5. Quit");
        }
    }
}
