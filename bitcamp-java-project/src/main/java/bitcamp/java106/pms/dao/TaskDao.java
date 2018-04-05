package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.domain.Task;
import bitcamp.java106.pms.util.ArrayList;

public class TaskDao<E> AbstractDao<E> {

    private int count(String teamName) {
        int cnt = 0;
        for (int i = 0; i < collection.size(); i++) {
            Task task = (Task) collection.get(i);
            if (task.getTeam().getName().toLowerCase().equals(
                    teamName.toLowerCase())) {
                cnt++;
            }
        }
        return cnt;
    }

    public Task[] list(String teamName) {
        Task[] arr = new Task[this.count(teamName)];
        for (int i = 0, x = 0; i < collection.size(); i++) {
            Task task = (Task) collection.get(i);
            if (task.getTeam().getName().toLowerCase().equals(
                    teamName.toLowerCase())) {
                arr[x++] = task;
            }
        }
        return arr;
    }

    public int indexOf(Object key) {
        int no = (Integer) key; 
        for (int i = 0; i < collection.size(); i++) {
            Board originBoard = (Board) collection.get(i);
            if (originBoard.getNo() == no) {
                return i;
            }
        }
        return -1;
    }
}

//ver 18 - ArrayList 클래스를 적용하여 객체(의 주소) 목록을 관리한다.
// ver 17 - 클래스 생성





