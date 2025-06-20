/* Author: Jack Williams
 * Dates: June 18th - June 20th
 * Description: The TaskList class creates a single LinkedList that holds Tasks. It
 *              has methods to create a list, complete a task, insert a task, and
 *              print the tasks in the list */

public class TaskList {

    // Attributes

    public ListNode headNode;
    public ListNode tailNode;
    public int sizeOfList;

    // Methods

    public void createTaskList(Task nodeValue){
        ListNode newNode = new ListNode();
        newNode.next = null;
        newNode.task = nodeValue;
        headNode = newNode;
        tailNode = newNode;
        sizeOfList = 1;
    }

    public boolean completeTaskByLocation(int location) {
        ListNode tempNode = headNode;

        for (int i = 0; i < location; i++) {
            tempNode = tempNode.next;
        }

        return tempNode.task.completeTask();
    }

    public void insertTaskList(Task nodeValue, int location) {
        ListNode newNode = new ListNode();
        newNode.task = nodeValue;

        if (headNode == null){
            createTaskList(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = headNode;
            headNode = newNode;
        } else if (location >= sizeOfList){
            newNode.next = null;
            tailNode.next = newNode;
            tailNode = newNode;
        } else {
            ListNode tempNode = headNode;
            int index = 0;

            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }

            ListNode nextNode = tempNode.next;
            tempNode.next = newNode;
            newNode.next = nextNode;
        }
        sizeOfList++;
    }

    public String toString() {
        StringBuilder results = new StringBuilder();

        if (headNode == null) {
            results.append("Task list does not exist");
        } else {
            ListNode tempNode = headNode;

            for (int i = 0; i < sizeOfList; i++) {
                assert false;
                results.append("Task ").append(i + 1).append(": ").append(tempNode.task.toString()).append("\n");

                tempNode = tempNode.next;
            }
        }

        return results.toString();
    }
}
