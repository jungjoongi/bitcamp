package step05.assignment;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);
        System.out.println("밑변의 길이를 입력하시오! ");
        int len = keyScan.nextInt();
        int count = 0;

        while(count < len) {
            int starCnt = 0;
            while (starCnt <= count){
                System.out.print("*");
                starCnt++;
                
            }
            System.out.println();
            count++;
        }


            
        


    }
}