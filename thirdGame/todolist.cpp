#include <iostream>
#include <vector>
#include <string>

// Structure to represent a task with description and completion status
struct Task {
    std::string description;
    bool completed;
};

int main() {
    // Vector to store tasks
    std::vector<Task> todoList; 

    //use while loop for the to do list
    while (true) {
        std::cout << "To-Do List:" << std::endl;
        std::cout << "----------------------------------" << std::endl;

        // Display tasks with their completion status
        for (size_t i = 0; i < todoList.size(); ++i) {

            // Using a ternary operator to display 'X' for completed tasks, and a space for incomplete tasks
            std::cout << "[" << (todoList[i].completed ? "X" : " ") << "] " << i + 1 << ". " << todoList[i].description << std::endl;
        }

        // have four different choices
        std::cout << "----------------------------------" << std::endl;
        std::cout << "Options:" << std::endl;
        std::cout << "1. Add Task" << std::endl;
        std::cout << "2. Mark Task as Completed" << std::endl;
        std::cout << "3. Delete Task" << std::endl; 
        std::cout << "4. Quit" << std::endl;

        // User input for choice
        int choice;
        std::cin >> choice; 

        // use if, else if and else for different choices
        //Enter a new task
        if (choice == 1) {
            std::string description;
            std::cout << "Enter task description: ";

            // Ignore the newline character left in the input stream
            std::cin.ignore(); 
            std::getline(std::cin, description);

            // creat new tasks
            Task newTask;
            newTask.description = description;
            newTask.completed = false;
            todoList.push_back(newTask);

            std::cout << "Task added successfully!" << std::endl;
        } 

        // Mark task as completed
        else if (choice == 2) {
            size_t taskIndex;
            std::cout << "Enter task number to mark as completed: ";
            std::cin >> taskIndex;

            if (taskIndex > 0 && taskIndex <= todoList.size()) {
                todoList[taskIndex - 1].completed = true;
                std::cout << "Task marked as completed!" << std::endl;
            } else {
                std::cout << "Invalid task number!" << std::endl;
            }
        } 
        // Delete task
        else if (choice == 3) {
            size_t taskIndex;
            std::cout << "Enter task number to delete: ";
            std::cin >> taskIndex;

            if (taskIndex > 0 && taskIndex <= todoList.size()) {
                
                // Erase the task from the vector
                todoList.erase(todoList.begin() + taskIndex - 1); 
                std::cout << "Task deleted successfully!" << std::endl;
            } else {
                std::cout << "Invalid task number!" << std::endl;
            }
        } 

        // Exit the program
        else if (choice == 4) {
            std::cout << "Exiting the to-do list. Goodbye!" << std::endl;
            break;
        } 

        // Handle invalid input
        else {
            std::cout << "Invalid choice. Please try again." << std::endl;
        }
    }

    return 0;
}