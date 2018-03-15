// 메서드: 개념 및 기본 문법 II
package step06;
import java.util.Scanner;
public class Exam02_3 {
    
    
    static String hello() {
       //값을 리턴하는 문법
       //return 값
       return "안녕하세요!";        

    }
    public static void main(String[] args) {
        System.out.println("main() 222222");

        // hello() 메서드를 실행하고, 그 리턴 값을 변수에 담는다.
        String r = hello();
        System.out.println(r);

        // 메서드가 갓을 리턴한다고 해서 반드시 그 값을
        // 변수에 받아야 하는 것은 아니다.
        // 변수에 받을 지 여부는 호출하는 쪽의 마음이다.

        hello(); // 이떄 값을 받을 변수가 없기 떄문에 리턴 값은 버려진다.

        // 리턴타입과 다른 타입의 변수로 값을 받으려 하면 컴파일 오류!
        // int = r2 hello(); // 컴파일 오류!
        

    }
}