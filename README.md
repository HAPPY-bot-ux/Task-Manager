Task Management Application 📋
Overview 🌟
The Task Management Application is a simple Java Swing-based desktop application designed to help users manage their tasks. The application allows users to add new tasks, view all tasks, delete tasks by their index, and exit the application. The project uses JFrame, JPanel, and other Swing components for a user-friendly interface and provides basic functionality to handle task management effectively.

Features 🚀
Add Tasks: Allows the user to enter a task and add it to the task list.
Delete Tasks: Users can delete tasks by specifying the index of the task.
View Tasks: View the complete list of all tasks added by the user.
Exit Application: Allows users to safely exit the application with a confirmation prompt.
Error Handling: Provides error messages for invalid input, such as empty fields or incorrect task indices.
Technologies Used 💻
Java: The core programming language for the application.
Java Swing: For creating the graphical user interface (GUI).
JOptionPane: For displaying dialog boxes (such as error messages and confirmation dialogs).
ArrayList: To store and manage the tasks dynamically.
Classes & Methods 📚
1. TaskManagement Class 🏠
This is the main class where the application starts. It sets up the graphical user interface (GUI) and handles task management actions like adding, viewing, and deleting tasks.

Components:
taskField: A text field where users can input a task.
deleteIndexField: A text field for entering the index of the task to delete.
Buttons:
Add: Adds the entered task to the task list.
Delete: Deletes the task at the specified index.
View Tasks: Displays all tasks in the console.
Exit: Exits the application with a confirmation prompt.
2. Action Listeners 📝
Add Button: Adds the task to the list if it is not empty and ensures there are no duplicate tasks.
Delete Button: Deletes a task based on the index provided in the delete index field. It validates the index and shows an error message if the index is invalid.
View Button: Displays all tasks currently in the list.
Exit Button: Asks for confirmation before exiting the application.
Getting Started 🛠️
To run the Task Management Application, follow these steps:

Prerequisites 📜
Ensure you have Java installed on your system. You can check if Java is installed by running the following command in your terminal or command prompt:

bash
Copy code
java -version
If Java is not installed, you can download it from Oracle's official website.

Steps to Run the Application 🖥️
Clone the Repository: Clone or download the project files to your local machine.

bash
Copy code
git clone https://github.com/Happy-bot-ux/task-management.git
cd task-management
Compile the Java Files: If you're using the command line, compile the .java files.

bash
Copy code
javac TaskManagement.java
Run the Application: After compilation, run the application.

bash
Copy code
java TaskManagement
Use the Application:

To add a task, type the task name and click the Add button.
To delete a task, input the task index (starting from 1) and click the Delete button.
To view all tasks, click the View Tasks button.
To exit the application, click the Exit button and confirm the exit prompt.
Example Usage 👇
Upon running the application, the main window will display the following inputs and buttons:

Task: Enter the task name you want to add.
Task Index: Enter the index number of the task you want to delete.
Add: Adds a new task to the list.
View Tasks: Displays the list of all added tasks in the console.
Exit: Exits the application after confirming.
