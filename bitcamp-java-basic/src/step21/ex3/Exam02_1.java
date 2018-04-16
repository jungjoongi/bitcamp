package step21.ex3;

public class Exam02_1 {

    static void m() throws Throwable {
        throw new Throwable();
    }


    static void m2() throws Error {
        throw new Error();
    }

    static void m3() /* throws Error */{
        throw new Error();
    }

    static void m4() throws Exception {
        throw new Exception();
    }
 
    static void m5() throws Exception {
        throw new String(); // 컴파일 오류! java.lang.throws 객채만 던질 수 있다.
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
