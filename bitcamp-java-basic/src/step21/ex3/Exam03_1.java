package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam03_1 {

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

    // 공통 분모를 만들어서 퉁 치는 방법
    static void m2(int i) throws Exception {
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
        
    }
}
