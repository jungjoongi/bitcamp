package step24.ex4;

public class Exam05 {
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
        
        MyThread t1 = new MyThread("t1");
        
        // 스레드의 우선수위 범위
        System.out.printf("우선순위범위 : %d ~ %d\n",
                Thread.MIN_PRIORITY, Thread.MAX_PRIORITY);

        //"main"스레드의 우선수위 보기
        System.out.printf("우선순위 기본값 : %d\n",
                Thread.NORM_PRIORITY);
        
        //"main"스레드의 우선수위 조회
        System.out.printf("main 스레드의 우선순위 : %d\n",
                Thread.currentThread().getPriority());

        //"t1"스레드의 우선수위 조회
        // -> main 스레드를 실행하는 동안 만든 스레드는 "main"의 자식 스레드라 부른다.
        System.out.printf("%s 스레드의 우선순위 : %d\n",
                t1.getName(), t1.getPriority());
        
        
    }
}


// main()가 끝나도 다른 메서드의 활동이 끝날때까지는 JVM이 종료되지 않는다