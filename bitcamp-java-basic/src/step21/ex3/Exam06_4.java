package step21.ex3;

import java.util.Scanner;

public class Exam06_4 {
    
    static class A {}
    static class B implements AutoCloseable {
        public void close() throws Exception {
            System.out.println("B클래스의 자원을 해제하였습니다.");
        }
    }
    
    static void m() throws Exception {

        try (
                //A obj = new A(); // 컴파일 오류!
                B obj = new B(); // 컴파일 오류!
                ){
            System.out.println("try블록 실행..");

        } 
    }

    public static void main(String[] args) throws Exception {
        // try블록에서 예외가 발생할 수 있는 메서드를 호출한다.
        m();
    }
}
