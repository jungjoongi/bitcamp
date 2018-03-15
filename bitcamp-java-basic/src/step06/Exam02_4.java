// 메서드: 개념 및 기본 문법 II
package step06;
import java.util.Scanner;
public class Exam02_4 {
    
    // 3) 메서드 : 리턴값(o), 파라미터 (o)
    // -> "이 돈갖고 과자좀 사와!"
    
    static String hello(String name, int age) {
        String retVal = String.format("%d살 %s님 환영합니다.", age, name);    
        return retVal;        

    }
    public static void main(String[] args) {
        System.out.println("main() 222222");

        // hello() 메서드를 실행하고, 그 리턴 값을 변수에 담는다.
        String r = hello("홍길동", 20);
        System.out.println(r);

        // 리턴값을 안 받아도 된다.

        hello("홍길동", 20); // 리턴값은 버려진다.
    }
}