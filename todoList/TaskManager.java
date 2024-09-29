package todoList;
import java.util.Scanner;
public class TaskManager {
    private ToDoList todolist;
    
    public void showMenu () {
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. Show Tasks");
        System.out.println("4. Show Completed Tasks");
        System.out.println("5. Show Pending Tasks");
        System.out.println("6. Mark Task as Complete");
        System.out.println("7. Exit");
    }

    public void handleUserInput(int option) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.println("Enter task name");
                String name = scanner.nextLine();
                System.out.println("Enter task description");
                String description = scanner.nextLine();
                System.out.println("Enter task due date");
                String dueDate = scanner.nextLine();
                Task task = new Task(name, description, dueDate);
                todolist.addTask(task);
                break;
            case 2:
                System.out.println("Enter task name");
                String name = scanner.nextLine();
                todolist.removeTask(name);
                break;
            case 3:
                todolist.showTasks();
                break;
            case 4:
                todolist.getCompletedTasks();
                break;
            case 5:
                todolist.getPendingTasks();
                break;
            case 6:
                todolist.markTaskAsComplete();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.todolist = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            taskManager.showMenu();
            int option = scanner.nextInt();
            taskManager.handleUserInput(option);
        }
    ­­­­}
}