// 흐름제어문 - switch 문법 II
package step05;
import java.util.Scanner;
enum Level {
    GUEST2, MEMBER2, ADMIN2
}
public class Exam02_4 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("사용자 레벨?");
        int level = keyScan.nextInt();

        // 상수를 사용하지 않았을 떄
        // -> 값의 의미를 
        switch (level) {
        case 0: // 손님
            System.out.println("조회만 가능합니다.");
            break;
            case 1: // 일반회원
            System.out.println("글작성 가능합니다.");
            break;
        case 2:// 관리자
            System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
            break;
        } 

        //상수를 사용하면 주석없이 바로 이해할수있다.
        final int GUEST = 0, MEMBER = 1, ADMIN = 2;

        switch (level) {
            case GUEST: // 손님
                System.out.println("조회만 가능합니다.");
                break;
            case MEMBER: // 일반회원
                System.out.println("글작성 가능합니다.");
                break;
            case ADMIN:// 관리자
                System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
                break;
        } 

 

        //enum으로 정의된 상수를 사용하려면
        // enum타입의 변수를 선언해야한다.
        // -> final int처럼 직접 값을 지정하지 않아도 된다.
        // -> 값을 지정할순 있지만 나중에 설명
        Level userLevel1 = Level.MEMBER2;
        switch (userLevel1) {
            case GUEST2: // 손님
                System.out.println("조회만 가능합니다.");
                break;
            case MEMBER2: // 일반회원
                System.out.println("글작성 가능합니다.");
                break;
            case ADMIN2:// 관리자
                System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
                break;
        } 
    }
}

// if vs switch 
// 복잡한 조건으로 프로그램 흐름을 제어해야하는 상황이라면
// if문을 사용하라!
// -> int나 문자열처럼 단순한 값으로 프로그램을 제어할 수 있다면,
// switch문을 사용하는게 낫다.