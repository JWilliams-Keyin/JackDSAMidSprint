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

    public String toString() {
        return "Username: " + userName +
                "\n" + userTasks.toString();
    }
}
