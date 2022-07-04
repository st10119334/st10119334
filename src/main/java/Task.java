/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab_services_student
 */
// To use array list
import java.util.*;
// Create tasks class with array
class Tasks{
    // Arrays to store individual developer data
    static ArrayList<String> arrDeveloper = new ArrayList<String>(); // store developer names
    static ArrayList<String> arrTasks = new ArrayList<String>(); // store task names
    static ArrayList<Integer> arrTaskid = new ArrayList<Integer>(); // store task ids
    static ArrayList<Integer> arrDuration = new ArrayList<Integer>(); // store durations
    static ArrayList<String> arrStatus = new ArrayList<String>(); // store status
    
    // Display all tasks
    public static void displayTasks(){
        // loop till size of list and display data using get
        for(int i=0;i<arrDeveloper.size();i++){
            System.out.println("\nTask #"+arrTaskid.get(i));
            System.out.println("Developer Name: "+arrDeveloper.get(i));
            System.out.println("Task Name: "+arrTasks.get(i));
            System.out.println("Task Duration: "+arrDuration.get(i));
            System.out.println("Status: "+arrStatus.get(i));
        }
    }
    public static void displayTaskWithStatusDone(){
        for(int i=0;i<arrDeveloper.size();i++){
            // Loop and compare status with Done 
            if(arrStatus.get(i).equals("Done")){
                // if that task found display that task detail
                System.out.println("\nDeveloper Name: "+arrDeveloper.get(i));
                System.out.println("Task Name: "+arrTasks.get(i));
                System.out.println("Task Duration: "+arrDuration.get(i));
            }
        }
    }
    public static void displayLongestDuration(){
        // Use some flags
        int longDur = 0;
        int longID = 0;
        int index = 0;
        for(int i=0;i<arrDeveloper.size();i++){
            if(arrDuration.get(i) > longDur){
                // Loop and compare if task duration is greater
                longDur = arrDuration.get(i);
                longID = arrTaskid.get(i);
                index = i;
            }    
        }
        // at the end of loop we can use index to display detail
        System.out.println("\nDeveloper Name: "+arrDeveloper.get(index));
        System.out.println("Task Name: "+arrTasks.get(index));
        System.out.println("Task Duration: "+arrDuration.get(index));
    }

    // function to search task with parameter as task name
    public static void searchTask(String task){
        int index = 0;
        for(int i=0;i<arrDeveloper.size();i++){
            // loop and compare with task
            if(arrTasks.get(i).equals(task)){
                index = i;
            }    
        }
        if(index == 0){
            System.out.println("\nNo Tasks Found!");
        }else{
            System.out.println("\nDeveloper Name: "+arrDeveloper.get(index));
            System.out.println("Task Name: "+arrTasks.get(index));
            System.out.println("Task Duration: "+arrDuration.get(index));
        }
    }
    public static void findTasks(String devname){
        int index = 0;
        for(int i=0;i<arrDeveloper.size();i++){
            if(arrDeveloper.get(i).equals(devname)){
                index = i;
            }    
        }
        if(index == 0){
            System.out.println("No Developer Found!");
        }else{
            System.out.println("Task Name: "+arrTasks.get(index));
        }
    }
    public static void deleteTask(String task){
        int index = -1;
        for(int i=0;i<arrDeveloper.size();i++){
        System.out.println(arrTasks.get(i)+" "+i+" "+task);
            if(arrTasks.get(i) == null ? task == null : arrTasks.get(i).equals(task)){
                index = i;
            }    
        }
        if(index == -1){
            System.out.println("No Developer Found!");
        }else{
            // delete data using index
            arrDeveloper.remove(index);
            arrTasks.remove(index);
            arrTaskid.remove(index);
            arrDuration.remove(index);
            arrStatus.remove(index);
            System.out.println("Task Deleted");
        }
    }
    
    public static void main(String ar[]){
        // add developers
        // Task 1
        arrDeveloper.add("Mike Smith");
        arrTasks.add("Create Login");
        arrTaskid.add(1);
        arrDuration.add(5);
        arrStatus.add("To Do");

        // Task 2
        arrDeveloper.add("Edward Harrison");
        arrTasks.add("Create Add Features");
        arrTaskid.add(2);
        arrDuration.add(8);
        arrStatus.add("Doing");

        // Task 3
        arrDeveloper.add("Samantha Paulson");
        arrTasks.add("Create Reports");
        arrTaskid.add(3);
        arrDuration.add(2);
        arrStatus.add("Done");
        
        // Task 4
        arrDeveloper.add("Glenda Oberholzer");
        arrTasks.add("Add Arrays");
        arrTaskid.add(4);
        arrDuration.add(11);
        arrStatus.add("To Do");

        // Display all tasks
        System.out.println("\n---- All Tasks ----");
        displayTasks();

        // Display task with status done
        System.out.println("\n---- Tasks with Status Done ----");
        displayTaskWithStatusDone();

        // Display developer with longest duration
        System.out.println("\n---- Developer with longest duration ----");
        displayLongestDuration();
        
        // Search with task name
        System.out.println("\n---- Search Task ----");
        searchTask("Check Reports");
        searchTask("Create Reports");

        // Get tasks of developer
        System.out.println("\n---- Developer Tasks ----");
        findTasks("Glenda Oberholzer");
 
        // Deleting task
        System.out.println("\n---- Deleting Task -  ----");
        deleteTask("Create Login");
        deleteTask("Create Reports");
        
        // Display all tasks
        System.out.println("\n---- All Tasks ----");
        displayTasks();
    }
}
