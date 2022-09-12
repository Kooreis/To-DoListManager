# Python Documentation

# ToDoListManager Python Script

This Python script is a simple command-line application that allows a user to manage a to-do list. The script provides options to add tasks, view tasks, delete tasks, and quit the application.

## Class Description

The script contains a single class, `ToDoListManager`, which encapsulates the functionality of the to-do list.

### `__init__(self)`

This is the constructor method for the `ToDoListManager` class. It initializes an empty list `self.tasks` which will hold the tasks added by the user.

### `add_task(self, task)`

This method takes a task (a string) as an argument and appends it to the `self.tasks` list.

### `view_tasks(self)`

This method prints all the tasks in the `self.tasks` list. Each task is numbered starting from 1.

### `delete_task(self, task_number)`

This method takes a task number as an argument and deletes the corresponding task from the `self.tasks` list. If the task number is invalid (i.e., it is greater than the number of tasks), it prints an error message.

### `run(self)`

This method starts the command-line interface for the application. It presents the user with a menu of options and executes the chosen option. The method runs in an infinite loop until the user chooses to quit the application.

## Main Program

The main program creates an instance of the `ToDoListManager` class and calls its `run` method to start the application.

## Libraries Used

This script does not import any libraries. It uses only built-in Python features.

---

# C# Documentation

# C# To-Do List Console Application

This is a simple console application written in C# that allows users to manage a to-do list. Users can add tasks, remove tasks, view the current list of tasks, or exit the program.

## Script Explanation

The script starts by importing two libraries:

- `System`: This is a built-in .NET library that provides fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions.

- `System.Collections.Generic`: This is a built-in .NET library that provides classes and interfaces that define generic collections, which allow users to create strongly typed collections that provide better type safety and performance than non-generic strongly typed collections.

The script then defines a `Program` class with a `Main` method, which is the entry point for the application. Inside the `Main` method, it does the following:

- Initializes an empty list of strings `toDoList` to store the tasks.

- Initializes a string `command` to store the user's command.

- Enters a while loop that continues until the user enters "exit".

- Inside the loop, it prompts the user to enter a command and reads the user's input.

- Depending on the command entered, it does one of the following:

  - "add": Prompts the user to enter a task and adds it to the list.

  - "remove": Prompts the user to enter a task number and removes the corresponding task from the list. If the task number is invalid, it prints an error message.

  - "view": Prints all tasks in the list.

  - "exit": Exits the loop, effectively ending the program.

  - If the command is not recognized, it prints an error message.

## Usage

To use this script, simply run it in a C# environment, such as Visual Studio or .NET Fiddle. When prompted, enter a command ("add", "remove", "view", or "exit") and follow the prompts.

---

# Java Documentation

# ToDoListManager in Java

This Java script is a simple console-based To-Do List Manager. It allows users to add tasks, remove tasks, and display all tasks in the list. The program will continue to prompt the user for commands until the user enters "exit".

## Imported Libraries

### java.util.ArrayList

The `java.util.ArrayList` library is a part of Java's collection framework. It provides us with dynamic arrays in Java. In this script, it is used to store the tasks in the to-do list. The ArrayList class provides various methods to manipulate the data (add, remove, etc.).

### java.util.Scanner

The `java.util.Scanner` library is a simple text scanner which can parse primitive types and strings. It breaks its input into tokens using a delimiter pattern, which by default matches whitespace. In this script, it is used to read the user's input from the console.

## Class and Method Descriptions

### ToDoListManager Class

This is the main class that contains all the methods for managing the to-do list and a main method for running the program.

#### addTask(String task)

This method takes a string as an argument and adds it to the ArrayList `toDoList`.

#### removeTask(int taskIndex)

This method takes an integer as an argument, which represents the index of the task in the ArrayList `toDoList` that needs to be removed.

#### displayTasks()

This method displays all the tasks in the ArrayList `toDoList`. It iterates through the ArrayList and prints each task with its corresponding index number.

#### main(String[] args)

This is the main method which is the entry point for any Java program. It creates an instance of the `ToDoListManager` class and a `Scanner` object to read the user's input. It then enters a loop where it prompts the user to enter a command and performs the corresponding action. The loop continues until the user enters "exit".

---
