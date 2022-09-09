```java
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {
    private ArrayList<String> toDoList = new ArrayList<>();

    public void addTask(String task) {
        toDoList.add(task);
    }

    public void removeTask(int taskIndex) {
        toDoList.remove(taskIndex);
    }

    public void displayTasks() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }
    }

    public static void main(String[] args) {
        ToDoListManager manager = new ToDoListManager();
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println("Enter command (add, remove, display, exit): ");
            command = scanner.nextLine();
            switch (command) {
                case "add":
                    System.out.println("Enter task: ");
                    String task = scanner.nextLine();
                    manager.addTask(task);
                    break;
                case "remove":
                    System.out.println("Enter task number: ");
                    int taskIndex = scanner.nextInt();
                    scanner.nextLine();
                    manager.removeTask(taskIndex - 1);
                    break;
                case "display":
                    manager.displayTasks();
                    break;
            }
        } while (!command.equals("exit"));
    }
}
```