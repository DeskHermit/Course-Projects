import java.util.ArrayList;
import java.util.Scanner;

public class Task{

    private int priority;
    private String dueDate;
    private String description;
    private int status;

    public Task(){
        priority = priority;
        dueDate = dueDate;
        description = description;
        status = status;
    }

    public int getPriority(){
        return priority;
    }

    public String getDueDate(){
        return dueDate;
    }

    public String getDescription(){
        return description;
    }

    public int getStatus(){
        return status;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setStatus(int status){
        this.status = status;
    }
}