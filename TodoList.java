import java.util.List;
import java.util.ArrayList;
public class ToDoList {
    private List<Task> tasks;
    
    public ToDoList() {
        tasks = new ArrayList<Task>();
    }
    
    public void addTask(Task task) {
        tasks.add(task);
    }
    
    public void removeTask(String taskName) {
        tasks.remove(task.getName(taskName));
    }
    
    public List<Task> getTasks() {
        return tasks;
    }

    public List<Task> getCompletedTasks() {
        List<Task> completedTasks = new ArrayList<Task>();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    public List<Task> getPendingTasks() {
        List<Task> pendingTasks = new ArrayList<Task>();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                pendingTasks.add(task);
            }
        }
        return pendingTasks;
    }

    public void showTasks() {
        for (Task task : tasks) {
            System.out.println(task.getName() + " - " + task.isCompleted());
        }
    }

    public void markTaskAsComplete(int taskId) {
        tasks.get(taskId).setComplete(true);
    }
}