package step11.ex7;

public class Exam01 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.printf("v1=%d, v2=%d\n", obj.v1, obj.v2);
        
        // 생성자 호출순서
        // 1) C클래스의 생성자 호출
        //    그 생성자의 첫 번째 문장이 수퍼클래스의 생성자를 호출하는 명령이다.
        //    그래서 수퍼 클래스인 B클래스의 생성자를 호출한다.
        // 2) B클래스의 생성자 호출
        //    그 생성자의 첫 번째 문장이 수퍼클래스의 생성자를 호출하는 명령이다.
        //    그래서 수퍼 클래스인 B클래스의 생성자를 호출한다.
        // 3) A클래스의 생성자 호출
        
    }
}