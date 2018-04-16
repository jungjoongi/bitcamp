package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam05_1 {

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


    public static void main(String[] args) {
        // try블록에서 예외가 발생할 수 있는 메서드를 호출한다.
        try {
        m(0);
        System.out.println("try");
        } catch (RuntimeException | SQLException | IOException e) {
            System.out.println("catch 1");
        } catch (Exception e) {
            System.out.println("catch 2");
        } finally {
            System.out.println("finally");
        }
        // 정상적으로 실행하거나 예외가 발생하더라도
        // finally 블록은 무조건 실행된다.
        // 즉 try~ catch~ 블록을 나가기 전에 반드시 실행한다.
    }
}
