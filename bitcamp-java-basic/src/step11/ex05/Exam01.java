package step11.ex05;

public class Exam01 {
    public static void main(String[] args) {
        B obj = new B();
        obj.v2 = 200;
        obj.v1 = 100;
        System.out.printf("v2=%d, v1=%d\n", obj.v2, obj.v1);
        // 실행을 해보면 static이 제일먼저 실행되는것을 알수가 있다!
        
        // 강사님 주석 참고
    }
}

// 용어정리!!
// 상속(inheritance)
// -> 기존에 만든 클래스를 자신의 코드처럼 사용하는 기법이다.
// -> 보통 기존 코드를 손대지 않고 새 코드를 덧붙일 때 많이 사용한다.
// 
// 수퍼클래스(super class) = 부모클래스(parents class)
// -> A클래스처럼  상속해주는 클래스를 말한다. 
//
// 서브클래스 (sub class) = 자식 클래스(child class)
// -> B클래스처럼 다른 클래스를 상속받는 클래스를 말한다.