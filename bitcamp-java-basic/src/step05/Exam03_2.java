// 흐름제어문 - switch 문법 II
package step05;
import java.util.Scanner;

public class Exam03_2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        // 1 ~100 합은?
        while (count < 100) {
            count++;
            sum += count;
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);

        System.out.println("------------------");
        //continue 사용전
        //1부터 100까지의 짝수의 합은?
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count %2 == 0) {
                sum += count;
            }
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);

        System.out.println("------------------");
        //continue 사용후
        //1부터 100까지의 짝수의 합은?
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count %2 == 1) 
                continue; // 다음문장을 실행하지 말고 즉시 조건 검사로 이동한다.
            sum += count;
            
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);

        System.out.println("------------------");
        //break 사용전
        //1부터 100까지의 짝수의 합은?
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count > 50) 
                continue;
                sum += count;
            
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);

        System.out.println("------------------");
        //break 사용후
        //1부터 100까지의 짝수의 합은?
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count > 50) 
                break;
                sum += count;
            
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);
    }
}