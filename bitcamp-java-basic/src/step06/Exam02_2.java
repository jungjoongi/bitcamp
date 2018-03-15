// 메서드: 개념 및 기본 문법 II
package step06;
import java.util.Scanner;
public class Exam02_2 {
    
    // 1) 함수1 : 리턴값(x), 파라미터(o)
    // -> 메서드 블록을 실핼할 때 값이 필요하다면 파라미터 변수를 선언하라!
    // -> "여기 돈 줄테니 밥먹고와!", "여기 등록금이다. 학비내라."
    
    static void hello(String name, int age) {
        // 파라미터?
        // - 메서드를 실행할 때 사용할 값을 외부로부터 받기 위해 선언한 로컬 변수
        // - 메서드를 실행할 때 생성되로 메서드 실행이 끝나면 제거된다.
        System.out.printf("%d살 %s님 반갑습니다.\n", age, name);
        

    }
    public static void main(String[] args) {
        System.out.println("main() 222222");

        // hello 메서드 호출하기
        hello("홍길동", 20);
        // hello 메서드 실행이 완료되면 다시 이리로 돌아와서
        // 다음 명령어를 실행한다.

        System.out.println("main() 222222");
        // 메서드는 언제든 필요할 때 마다 반복하여 실행할 수 있다.
        hello("홍길동", 20);

        System.out.println("main() 333333");

        hello("유관순", 16);
        
        System.out.println("main() 444444");

        // 파라미터의 타입, 개수, 순서가 일치해야 한다.
        // hello("윤봉길"); // 컴파일 오류!
        
        // hello(20, "윤봉길"); // 컴파일 오류!
        // String r = hello("안중근 , 30"); // 컴파일 오류!
        

    }
}
// 아규먼트(argument)
// -> 메서드를 호출할때 넘겨주는 값
// -> hello("홀길동", 20);
//    "홀길동", 20이 아규먼트이다.
// 파라미터 (parameter)
// -> 아규먼트를 받는 변수
// void hello(String nanem, int age) {...}
//  name과 age 변수가 파라미터이다.
//
// 현장에서는 "아규먼트와" "파라미터"를 구분하지 않는다.