package step24.ex2;

public class Exam02 {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        
        ThreadGroup Group = main.getThreadGroup();
        
        System.out.println("그룹명 = " + Group.getName());
    }
}
