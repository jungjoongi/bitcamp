package step24.ex4;

public class Exam02 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("스레드 실행 전");
        Thread t = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("---->  " + i);
                }
                System.out.println("멀티스레드 종료");
            }
           
        };
        t.start();
        
        t.join();
        System.out.println("스레드 실행 후");
        
        // 생명주기 불가!!! 이미 끝난스레드는 다시 running 할 수 없다.
        t.start();
        
    }
}


// main()가 끝나도 다른 메서드의 활동이 끝날때까지는 JVM이 종료되지 않는다