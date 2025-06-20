/* Author: Jack Williams
 * Dates: June 18th - June 20th
 * Description: The User class is a POJO that handles the data related to Users that
 *              are added to an ArrayList. The data it holds includes userName
 *              and userTasks. It has methods to add a task to the list, complete a
 *              task, and print all tasks */

public class User {

    // Attributes

    public String userName;
    public TaskList userTasks = new TaskList();

    // Constructor

    public User(String userName) {
        this.userName = userName;
    }

    // Getters & Setters

    public String getUserName() {
        return userName;
    }

    public TaskList getUserTasks() {
        return userTasks;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserTasks(TaskList userTasks) {
        this.userTasks = userTasks;
    }

    // Methods

    public void addTaskToUserTasks(Task newTask) {
        userTasks.insertTaskList(newTask, userTasks.sizeOfList);
    }

    public boolean markTaskAsComplete(int taskLocation) {
        return userTasks.completeTaskByLocation(taskLocation);
    }

    public String toString() {
        return "Username: " + userName +
                "\n" + userTasks.toString();
    }
}
