// do ~ while 반복문
package step05;
import java.util.Scanner;

public class Exam03_4 {
    public static void main(String[] args) {
        int i = 0;

        do
            System.out.println(++i);
        while (i < 10);

        System.out.println("-------------");

        // 여러개의 문장을 반복할 떄는 블록으로 묶어라!
        i = 0;
        do{
            i += 1;
            System.out.println(i);
        }while (i < 10);
    }
}