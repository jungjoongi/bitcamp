// 메서드 사용후
package step06;
import java.util.Scanner;
public class Exam01_3 {

    // 스페이스 출력 기능

    public static void printSpaces(int len){

        for (int i = 0 ; i < len; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int len) {
        for (int i = 0 ; i < len; i++) {
            System.out.print("*");
        }
    }

    // 코드를 유지보수하기 쉽도록 가능한 기능 별로 묶어둔다.
    
    public static int getSpaceLength(int totalStar, int displayStar) {
        return (totalStar - displayStar) / 2;
    }

    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);

        System.out.println("밑변길이? ");
        int len = keyScan.nextInt();

        for (int starLen = 1; starLen <= len; starLen += 2) {
            printSpaces(getSpaceLength(len, starLen));
            printStars(starLen);
            System.out.println();
        }
    }
}