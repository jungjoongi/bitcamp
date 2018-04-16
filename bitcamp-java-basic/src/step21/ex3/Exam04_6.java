package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam04_6 {

    static void m(int i) throws Exception, RuntimeException, SQLException, IOException {
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
        m(1);
        } catch (RuntimeException | SQLException | IOException e) {
        
        } catch (Exception e) {
            
            // RuntimeException, SQLException, IOException 모두
            // Exception의 서브 클래스이기 때문에 이 블록에서 모드 처리할 수있다.
        } 
    }
}
