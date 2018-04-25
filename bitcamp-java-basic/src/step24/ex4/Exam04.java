package step24.ex4;

public class Exam04 {
    public static void main(String[] args) throws Exception {

        class MyThread extends Thread {
            public MyThread(String name) {
                super(name);
            }
            public void run() {
                for (int i = 0; i < 1000; i++)
                    System.out.printf("%s %d\n", this.getName(), i);
            }
        }
        
        MyThread t1 = new MyThread("홍길동======>");
        MyThread t2 = new MyThread("오호라------>");
        MyThread t3 = new MyThread("우헤헤######");
        
        t1.start();
        t2.start();
        t3.start();
        for (int i = 0; i < 1000; i++)
            System.out.printf("main 스레드 :%d\n", i);
        
        // 3초동안 not runnable 상태로 만든다.
        Thread.currentThread().sleep(3000);

        System.out.println("스레드 실행 후");

        // 생명주기 불가!!! 이미 끝난스레드는 다시 running 할 수 없다.

    }
}


// main()가 끝나도 다른 메서드의 활동이 끝날때까지는 JVM이 종료되지 않는다