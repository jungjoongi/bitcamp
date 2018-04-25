package step24.ex4;

public class Exam01 {
    public static void main(String[] args) {
        
        System.out.println("스레드 실행 전");
        new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("---->  " + i);
                }
                System.out.println("멀티스레드 종료");
            }
           
        }.start();
        
        System.out.println("스레드 실행 후");
        
    }
}


// main()가 끝나도 다른 메서드의 활동이 끝날때까지는 JVM이 종료되지 않는다