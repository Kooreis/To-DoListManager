```CSharp
using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        List<string> toDoList = new List<string>();
        string command = "";

        while (command != "exit")
        {
            Console.WriteLine("Enter command (add, remove, view, exit): ");
            command = Console.ReadLine();

            switch (command)
            {
                case "add":
                    Console.WriteLine("Enter task: ");
                    string task = Console.ReadLine();
                    toDoList.Add(task);
                    break;

                case "remove":
                    Console.WriteLine("Enter task number to remove: ");
                    int taskNumber = Convert.ToInt32(Console.ReadLine());
                    if (taskNumber > 0 && taskNumber <= toDoList.Count)
                    {
                        toDoList.RemoveAt(taskNumber - 1);
                    }
                    else
                    {
                        Console.WriteLine("Invalid task number.");
                    }
                    break;

                case "view":
                    for (int i = 0; i < toDoList.Count; i++)
                    {
                        Console.WriteLine((i + 1) + ". " + toDoList[i]);
                    }
                    break;

                case "exit":
                    break;

                default:
                    Console.WriteLine("Invalid command.");
                    break;
            }
        }
    }
}
```