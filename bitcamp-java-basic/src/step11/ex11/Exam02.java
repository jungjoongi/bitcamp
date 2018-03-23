// 오버라이딩 문법과 의미
package step11.ex11;

public class Exam02 {
    public static void main(String[] args) {
        A2 obj1 = new A2();
        obj1.name = "홍길동";
        obj1.age = 20;

        obj1.print();
        obj1.print2();
        
        // 부모 클래스로부터 상속 받은 메서드를 재정의할 수 없어서
        // 새 메서드를 만들어야 한다면,
        // 같은(유사한) 일을 하는 메서드의 이름이 다르기 때문에 
        // 개발자는 여러개의 메서드를 암기해야 하는 어려움이 생긴다.
    }
}
