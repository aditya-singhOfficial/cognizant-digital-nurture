public class TaskManager {

    private Node head;

    public void addTask(Task task) {

        Node newTask = new Node(task);

        if (head == null) {
            head = newTask;
            System.out.println("Task created.");
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newTask;
        System.out.println("Task created.");
    }

    public void traverseTask() {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void searchTask(int id) {

        Node current = head;

        while (current != null) {

            if (current.data.getTaskId() == id) {
                System.out.println(current.data);
                return;
            }

            current = current.next;
        }

        System.out.println("Task not found.");
    }

    public void deleteTask(int id) {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.data.getTaskId() == id) {
            head = head.next;
            System.out.println("Task removed.");
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data.getTaskId() == id) {
                current.next = current.next.next;
                System.out.println("Task removed.");
                return;
            }

            current = current.next;
        }

        System.out.println("Task not found.");
    }
}