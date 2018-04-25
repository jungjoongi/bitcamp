package step24.ex4;

public class Exam06 {
    public static void main(String[] args) throws Exception {

        class MyThread extends Thread {
            public MyThread(String name) {
                super(name);
            }
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < 900000000; i++)
                    Math.asin(38.257);
                long endTime = System.currentTimeMillis();
                System.out.printf("MyThread = %d\n", endTime - startTime);
            }
        }
        Thread.currentThread().setPriority(10);
        MyThread t1 = new MyThread("t1");
        t1.setPriority(1);
        
        System.out.printf("main 스레드의 우선순위 : %d\n",
                Thread.currentThread().getPriority());

        System.out.printf("%s 스레드의 우선순위 : %d\n",
                t1.getName(), t1.getPriority());
        // t1 작업시작
        t1.start();
        
        
        // main 작업시작        
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++)
            Math.asin(38.257);
        long endTime = System.currentTimeMillis();
        System.out.printf("main = %d\n", endTime - startTime);
        
        
    }
}


// main()가 끝나도 다른 메서드의 활동이 끝날때까지는 JVM이 종료되지 않는다