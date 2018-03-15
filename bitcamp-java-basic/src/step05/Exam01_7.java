// 흐름제어문 - else문의 소속
package step05;
import java.util.Scanner;

public class Exam01_7 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        
        int age = keyScan.nextInt();

        if (age < 8)
            System.out.println("아동입니다.");
        else 
            if (age > 8 && age < 14)
            System.out.println("어린이입니다.");
            else
                if (age >= 14 && age < 19)
                System.out.println("청소년입니다.");
                else 
                    if (age >= 19 && age < 65)
                        System.out.println("성인입니다.");
                    else
                        System.out.println("노인입니다.");

        // if ~ else를 보기좋게 정렬하자
        // 실무에서는 다음과 같이 정렬한다.
        // 주의! else if 라는 문법은 없다!
        // 다만 다음과 같이 정렬한 것이다.
        if (age < 8)
            System.out.println("아동입니다.");
        else if (age > 8 && age < 14)
            System.out.println("어린이입니다.");
        else if (age >= 14 && age < 19)
            System.out.println("청소년입니다.");
        else if (age >= 19 && age < 65)
            System.out.println("성인입니다.");
        else
            System.out.println("노인입니다.");
                
            
        
    }
}