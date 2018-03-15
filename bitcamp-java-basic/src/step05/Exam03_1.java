// 흐름제어문 - switch 문법 II
package step05;
import java.util.Scanner;

public class Exam03_1 {
    public static void main(String[] args) {
        int count = 0;

        // while (조건) 문장
        // -> 조건이 참인 동안 문장을 계속 실행한다.
        while (count < 5) 
            System.out.println(count++);
        
        System.out.println("==============");
        count = 0;
        while (count < 5) 
            System.out.println(count);
            count++;
        // while (조건) {}
        // -> 여러 개의 문장을 반복 실행하려면 블록으로 묶어라!
    }
}