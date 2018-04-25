package step24.ex2;

public class Exam05 {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        ThreadGroup mainGroup = main.getThreadGroup();
        
        ThreadGroup pareantGroup = mainGroup.getParent(); 
        
        System.out.println("main그룹에 소속된 하위 그룹들:");
            System.out.println("  --> " + pareantGroup.getName());
            
    }
}
