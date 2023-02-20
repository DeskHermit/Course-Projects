import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nanajjar
 */
public class TaskTrackerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("******** Welcome to ITSC 1213 Task Tracking System ********");
        System.out.println("");
        TaskTracker tracker = new TaskTracker();

        Scanner scnr = new Scanner(System.in);
        boolean userActive = true;

        while (userActive) {
            // see what the user wants to do
            System.out.println("What would you like to do?");
            System.out.println("\t 1. Add a task");
            System.out.println("\t 2. List all tasks");
            System.out.println("\t 3. Update task status");
            System.out.println("\t 4. Delete a task.");
            System.out.println("\t 5. Show number of tasks currently in progress.");
            System.out.println("\t 6. Exit");
            System.out.println("-----------------------------------");
            System.out.print("Enter your selection by typing a number (1-6): ");

            int num = scnr.nextInt();
            scnr.nextLine(); // consume the new line (enter)
            switch (num) {

                case 1:
                    System.out.println("-----------------------------------");
                    // ask the user for task description
                    System.out.println("Describe your new task:");
                    System.out.println("");// a blank line for readiblity 
                    String description = scnr.nextLine();
                    tracker.addTask(description);
                    System.out.println("");// a blank line for readiblity 
                    break;
                case 2:
                    System.out.println("-----------------------------------");
                    viewTasks(tracker);
                    break;
                case 3:
                    System.out.println("TO DO - UPDATE TASK STATUS");
                    break;
                case 4:
                    System.out.println("TO DO - DELETE TASK");
                    break;
                case 5:
                    System.out.println("TO DO - NUMBER OF IN PROGRESS TASKS");
                    break;
                case 6:
                    userActive = false;
                    break;
                default:
                    System.out.println("Sorry, but you need to enter a number from 1 to 6 ");

            } //end switch
            System.out.println("-----------------------------------");

        } //end while loop

    }

    private static void viewTasks(TaskTracker tracker) {
        System.out.println("Viewing Tasks");
        ArrayList<Task> tasks = tracker.getTasks();
        if(tasks.size() == 0 ){
            System.out.println("You have no tasks. Start adding tasks to keep tack of your progress");
        }
        
        for (Task aTask : tasks) {
            System.out.println("\t ******");
            System.out.println("\t Due on: " + aTask.getDueDate());
            System.out.println("\t Details: " + aTask.getDescription());
            System.out.println("\t Status: " + aTask.getStatus());
        }
    }
}


