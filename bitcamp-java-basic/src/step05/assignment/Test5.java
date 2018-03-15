package step05.assignment;
import java.util.Scanner;
public class Test5 {

    public static void printSpace(int len) {
        for (int i = 0 ; i < len ; i++) {
            System.out.print(" ");
        }
    }

    public static void printstar(int len) {
        for (int i = 0; i < len ; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);
        System.out.println("밑변의 길이를 입력하시오! ");
        int len = keyScan.nextInt();

        for (int i = 1 ; i <= len ; i += 2) {
            printSpace((len - i) / 2);
            printstar(i);
            System.out.println();
        }
        

    }
}