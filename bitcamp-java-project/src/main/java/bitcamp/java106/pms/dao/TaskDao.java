package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Task;

public class TaskDao {


    public Task get(String projectName) {
        int i = this.getTeamIndex(projectName);
        if (i == -1)
            return null;
        return tasks[i];
    }


    public Task[] list() {
        Task[] arr = new Task[this.taskIndex];
        for (int i = 0; i < this.taskIndex; i++) 
            arr[i] = this.tasks[i];
        return arr;
    }

    private int getTeamIndex(String name) {
        for (int i = 0; i < this.taskIndex; i++) {
            if (this.tasks[i] == null) continue;
            if (name.equals(this.tasks[i].getProjectName().toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

}
