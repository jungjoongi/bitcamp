package step24.ex3;

public class Exam02 {
    public static void main(String[] args) {
        
        
        class MyRunnerable implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("---->  " + i);
                }
            }
        }
        Thread t = new Thread(new MyRunnerable());
        t.start();
        
        for (int i = 0; i < 1000; i++) {
            System.out.println(">>>>>  " + i);
        }
        
    }
}
