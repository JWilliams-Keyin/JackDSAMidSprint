public class Task {

    // Attributes

    public String taskDescription;
    public boolean taskStatus;

    // Constructor

    public Task(String taskDescription) {
        this.taskDescription = taskDescription;
        this.taskStatus = false;
    }

    // Getters & Setters

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    // Methods

    public boolean completeTask() {
        return this.taskStatus = true;
    }

    // This method converts the boolean version of taskStatus to a "Complete" or "Pending" status
    public String convertBooleanStatusToString() {
        if (this.taskStatus) {
            return "Complete";
        } else {
            return "Pending";
        }
    }

    public String toString() {
        return taskDescription + "\n" +
                "Status: " + convertBooleanStatusToString();
    }
}
