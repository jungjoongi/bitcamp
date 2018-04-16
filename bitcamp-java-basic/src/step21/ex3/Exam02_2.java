package step21.ex3;

public class Exam02_2 {

    static void m() throws Throwable {
        throw new RuntimeException();
    }


    static void m2() {
        throw new RuntimeException();
    }

    
    public static void main(String[] args) {
        try {
            m();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("시스템을 종료합니다.");
    }
}
