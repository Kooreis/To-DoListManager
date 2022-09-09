```python
class ToDoListManager:
    def __init__(self):
        self.tasks = []

    def add_task(self, task):
        self.tasks.append(task)

    def view_tasks(self):
        for i, task in enumerate(self.tasks, start=1):
            print(f"{i}. {task}")

    def delete_task(self, task_number):
        try:
            del self.tasks[task_number - 1]
        except IndexError:
            print("Invalid task number!")

    def run(self):
        while True:
            print("\n1. Add task\n2. View tasks\n3. Delete task\n4. Quit")
            choice = input("Choose an option: ")

            if choice == "1":
                task = input("Enter a task: ")
                self.add_task(task)
            elif choice == "2":
                self.view_tasks()
            elif choice == "3":
                task_number = int(input("Enter task number to delete: "))
                self.delete_task(task_number)
            elif choice == "4":
                break
            else:
                print("Invalid choice!")

if __name__ == "__main__":
    manager = ToDoListManager()
    manager.run()
```