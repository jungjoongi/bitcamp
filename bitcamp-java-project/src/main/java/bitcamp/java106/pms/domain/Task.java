package bitcamp.java106.pms.domain;

import java.sql.Date;
import java.util.Scanner;

public class Task {
    private String projectName;
    private Date StartDate;
    private Date EndDate;
    Task[] tasks = new Task[1000];
    int taskIndex = 0;
    
    static Scanner keyScan = new Scanner(System.in);
   
    public String getProjectName() { 
        return projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    public Date getStartDate() {
        return StartDate;
    }
    
    public void setStartDate(Date startDate) {
        StartDate = startDate;
    } 
    
    public Date getEndDate() {
        return EndDate;
    }
    
    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }
    


    public void insert(Task task) {
        this.tasks[this.taskIndex++] = task;

    }
    
    public static void taskAdd() {
        Task task = new Task();
 
        System.out.println("작업명?");
        task.setProjectName(keyScan.nextLine());

        System.out.println("시작일?");
        task.setStartDate(Date.valueOf(keyScan.nextLine()));

        System.out.println("종료일?");
        task.setEndDate(Date.valueOf(keyScan.nextLine()));
        
        task.insert(task);
        
    
    }
    
    
    
}
