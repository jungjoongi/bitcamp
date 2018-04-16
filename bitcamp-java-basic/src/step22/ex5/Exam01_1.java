// Byte Stream - 바이트 단위로 출력하기
package step22.ex5;

import java.io.FileInputStream;

public class Exam01_1 {
    public static void main(String[] args) throws Exception {

        FileInputStream in = new FileInputStream("temp/jls8.pdf");

        int b;
        int callcount = 0;
        long startTime = System.currentTimeMillis();
        while((b = in.read()) != -1) callcount++ ;

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(callcount);

        in.close();
    }
}
