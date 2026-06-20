public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        manager.addTask(new Task(101, "Design Login Page", "In Progress"));
        manager.addTask(new Task(102, "Create Dashboard", "Pending"));
        manager.addTask(new Task(103, "Database Setup", "Completed"));
        manager.addTask(new Task(104, "API Integration", "In Progress"));
        manager.addTask(new Task(105, "Testing", "Pending"));

        System.out.println("\nAll Tasks");
        System.out.println("----------------------");
        manager.traverseTask();

        System.out.println("\nSearch Result");
        System.out.println("----------------------");
        manager.searchTask(101);

        System.out.println("\nAfter Deletion");
        System.out.println("----------------------");
        manager.deleteTask(105);

        manager.traverseTask();
    }
}