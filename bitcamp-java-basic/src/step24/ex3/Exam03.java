package step24.ex3;

public class Exam03 {
    public static void main(String[] args) {
        
        
        // 스레드를 상속받은 익명클래스
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("---->  " + i);
                }
            }
        }.start();
        
        for (int i = 0; i < 1000; i++) {
            System.out.println(">>>>>  " + i);
        }
        
    }
}
