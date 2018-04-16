package step21.ex3;

import java.io.FileReader;
import java.util.Scanner;

public class Exam06_3 {
    static void m() throws Exception {
        // 자원해제시키는 코드를 매번 직성하기가 귀찮다.
        // -> try-with-resources라는 문법을 사용하면
        //    굳이 close()를 직접 호출할 필요가 없다.
        // -> 단 java.lang.AutoCloseable 구현체에 대해서만 가능하다.
        // -> 문법
        // try
        try (
                Scanner keyScan = new Scanner(System.in); 
                //FileReader in = new FileReader("Hello.java"); // 구현체이다


                // String s = "hello"; 컴파일 오류!
                // if (true) {}
                ){

            System.out.println("입력> ");
            int value = keyScan.nextInt();
            System.out.println(value * value);
        } 
    }

    public static void main(String[] args) throws Exception {
        // try블록에서 예외가 발생할 수 있는 메서드를 호출한다.
        m();
    }
}
