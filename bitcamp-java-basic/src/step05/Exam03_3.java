// 흐름제어문 - 중첩된 반복문 탈출
package step05;
import java.util.Scanner;

public class Exam03_3 {
    public static void main(String[] args) {
        int x = 2;
        int y = 1;

        // 1 ~100 합은?
        // 라벨명 : while 반복문1 {반복문2 {break 라벨명;}}
        myloop:
        while (x <= 9) {
            while(y <= 9) {
                System.out.printf("%d * %d = %d\n", x, y, x * y);

                if (x == 5 && y == 5)
                    //break; // 지금 위치에서 가장 가까운 반목문만 나간다.
                    break myloop; // myloop 라벨에 소속된 문장을 나간다.
                y++;
            }
            System.out.println();
            x++;
            y = 1;
        }
    }
}