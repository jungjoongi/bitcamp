package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam05_2 {

    static void m(int i) throws Exception, RuntimeException, SQLException, IOException {
        if (i < 0)
            return;
        if (i == 0)
            throw new Exception();
        else if (i == 1)
            throw new RuntimeException();
        else if (i == 2)
            throw new SQLException();
        else
            throw new IOException();
    }
    
    static void test1() throws Exception {
        try {
            m(-1);
        } finally {
            System.out.println("정상적인 실행일때!");
        }
    }
    
    static void test2() throws Exception {
        try {
            m(0);
        } finally {
            // try블록을 나가기 전에 무조건 실행해야 할 작업이 있다면
            // finally 블록만 사용할 수 있다.
            System.out.println("Exception 예외가 발생했을 때!");
        }
    }


    public static void main(String[] args) {
        // try블록에서 예외가 발생할 수 있는 메서드를 호출한다.
        try { test1();} catch (Exception e) {}
        try { test2();} catch (Exception e) {}
        // 정상적으로 실행하거나 예외가 발생하더라도
        // finally 블록은 무조건 실행된다.
        // 즉 try~ catch~ 블록을 나가기 전에 반드시 실행한다.
    }
}
