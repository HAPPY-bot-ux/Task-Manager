package taskmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

//Happy Nldovu
/**
 * TaskManagement - A simple task management application using Java Swing.
 * This program allows users to add, view, and delete tasks from a list.
 */
public class TaskManagement extends JFrame {

    private ArrayList<String> tasks;  // List to hold tasks
    private JTextField taskField, deleteIndexField;  // Input fields for adding and deleting tasks
    private JButton addButton, removeButton, viewButton, exitButton;  // Buttons for actions

    /**
     * Constructor to set up the GUI and handle task management logic.
     */
    public TaskManagement() {
        tasks = new ArrayList<>();  // Initialize task list

        // Window settings
        setTitle("Task Manager");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Title label at the top
        JLabel titleLabel = new JLabel("Task Management Application", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Input fields and buttons for task management
        taskField = new JTextField(20);  // Field to enter tasks
        deleteIndexField = new JTextField(5);  // Field to enter task index for deletion
        addButton = new JButton("Add");  // Button to add tasks
        removeButton = new JButton("Delete");  // Button to delete tasks
        viewButton = new JButton("View Tasks");  // Button to view all tasks
        exitButton = new JButton("Exit");  // Button to exit the program

        // Panel for task management inputs and buttons
        JPanel taskPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // First row: Task input field and buttons
        gbc.gridx = 0; gbc.gridy = 0;
        taskPanel.add(new JLabel("Task:"), gbc);

        gbc.gridx = 1; gbc.gridy = 0; gbc.gridwidth = 2;
        taskPanel.add(taskField, gbc);

        gbc.gridx = 3; gbc.gridy = 0; gbc.gridwidth = 1;
        gbc.insets = new Insets(10, 10, 10, 10);  // Space between Add and View buttons
        taskPanel.add(addButton, gbc);

        gbc.gridx = 4; gbc.gridy = 0; gbc.gridwidth = 1;
        taskPanel.add(viewButton, gbc);

        // Second row: Delete by index input field and button
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1;
        taskPanel.add(new JLabel("Task Index:"), gbc);

        gbc.gridx = 1; gbc.gridy = 1;
        taskPanel.add(deleteIndexField, gbc);

        gbc.gridx = 2; gbc.gridy = 1;
        taskPanel.add(removeButton, gbc);

        // Bottom panel for exit button
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bottomPanel.add(exitButton);

        // Add components to the frame
        add(titleLabel, BorderLayout.NORTH);
        add(taskPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Action listener for adding tasks
            addButton.addActionListener(e -> {
            String task = taskField.getText();
            if (!task.isEmpty()) {
                if (tasks.contains(task)) {
                    JOptionPane.showMessageDialog(this, "Task already exists.");
                } else {
                    tasks.add(task);  // Add the task                    
                    taskField.setText("");
                    JOptionPane.showMessageDialog(this, "Task added successfully!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Task cannot be empty.");
            }
        });
        // Action listener for deleting tasks
       removeButton.addActionListener(e -> {
            try {
                int index = Integer.parseInt(deleteIndexField.getText()) - 1;
                if (index >= 0 && index < tasks.size()) {
                    tasks.remove(index);
                    System.out.println("Task " + (index + 1) + " removed successfully."); 
                    StringBuilder taskList = new StringBuilder();
                    System.out.println();
                    for (int i = 0; i < tasks.size(); i++) {
                        taskList.append((i + 1)).append(". ").append(tasks.get(i)).append("\n");
                    }
                    System.out.println(taskList.toString());
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid task number.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid number.");
            }
            deleteIndexField.setText("");
        });

        // Action listener for viewing tasks
         viewButton.addActionListener(e -> {
            if (tasks.isEmpty()) {
                System.out.println("No tasks available.");
            } else {
                StringBuilder taskList = new StringBuilder("Task List:\n");
                for (int i = 0; i < tasks.size(); i++) {
                    taskList.append((i + 1)).append(". ").append(tasks.get(i)).append("\n");
                }
                System.out.println(taskList.toString());
            }
        });


        // Action listener for exiting the application
        exitButton.addActionListener(e -> {
            int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                dispose();  // Close the application
            }
        });

        // Make the window visible
        setVisible(true);
    }

    /**
     * Main method to launch the application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TaskManagement::new);  // Start the application on the Swing thread
    }
}
