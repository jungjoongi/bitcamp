package step24.ex4;

public class Exam03 {
    public static void main(String[] args) throws Exception {

        System.out.println("스레드 실행 전");
        new Thread() {
            public void run() {
                System.out.println("Hello!");
            }
        }.start();
        
        // 3초동안 not runnable 상태로 만든다.
        Thread.currentThread().sleep(3000);

        System.out.println("스레드 실행 후");

        // 생명주기 불가!!! 이미 끝난스레드는 다시 running 할 수 없다.

    }
}


// main()가 끝나도 다른 메서드의 활동이 끝날때까지는 JVM이 종료되지 않는다