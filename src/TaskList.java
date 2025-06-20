public class TaskList {

    // Attributes

    public ListNode headNode;
    public ListNode tailNode;
    public int sizeOfList;

    // Methods

    public ListNode createTaskList(Task nodeValue){
        ListNode newNode = new ListNode();
        newNode.next = null;
        newNode.task = nodeValue;
        headNode = newNode;
        tailNode = newNode;
        sizeOfList = 1;
        return headNode;
    }

    public Task getTaskByLocation(int location) {
        ListNode tempNode = headNode;

        for (int i = 0; i < location; i++) {
            tempNode = tempNode.next;
        }

        return tempNode.task;
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

    public void deleteFromTaskList(int location) {
        if (location < 0 || location >= sizeOfList) {
            System.out.println("Inputted location is out of bounds of list");
            return;
        } else if (location == 0) {
            headNode = headNode.next;
        } else if (location == sizeOfList - 1) {
            ListNode tempNode = headNode;
            int index = 0;

            while (index < location -1) {
                tempNode = tempNode.next;
                index++;
            }

            tempNode.next = null;
            tailNode = tempNode;
        } else {
            ListNode tempNode = headNode;
            int index = 0;

            while (index < location -1) {
                tempNode = tempNode.next;
                index++;
            }

            tempNode.next = tempNode.next.next;
        }
        sizeOfList--;
    }

    public String toString() {
        StringBuilder results = null;

        if (headNode == null) {
            results = new StringBuilder("Task list does not exist");
        } else {
            ListNode tempNode = headNode;

            for (int i = 0; i < sizeOfList; i++) {
                assert false;
                results.append("Task ").append(i + 1).append(":").append(tempNode.task.toString()).append("\n");

                tempNode = tempNode.next;
            }
        }

        assert results != null;
        return results.toString();
    }
}
