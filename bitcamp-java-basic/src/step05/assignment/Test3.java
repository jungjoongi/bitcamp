package step05.assignment;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
      
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();

        int mainCnt = 1;
        while (mainCnt <= len) {
            int spaceCnt = 1;
            int spaceLen = (len - mainCnt) / 2;

            while (spaceCnt <= spaceLen) {
                System.out.print(" ");
                spaceCnt++;
            }
            int starCnt = 1;
            while (starCnt <= mainCnt) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            mainCnt += 2;
        }

    }
}