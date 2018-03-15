// 메서드 사용후
package step06;
import java.util.Scanner;
public class Exam01_2 {

    // 스페이스 출력 기능

    public static void printSpace(int len){

        for (int i = 0 ; i < len; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int len) {
        for (int i = 0 ; i < len; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);

        System.out.println("밑변길이? ");
        int len = keyScan.nextInt();

        for (int starLen = 1; starLen <= len; starLen += 2) {
            printSpace((len = starLen) / 2);
            printStars(starLen);
            System.out.println();
        }
    }
}