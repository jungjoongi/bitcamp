// 다형적 변수와 오버라이딩
package step11.ex14;

import step11.ex10.B;

public class Exam01 {
    public static void main(String[] args) {
        A a = new A();
        A2 a2 = new A2();
        
        // A객체 사용
        a.m();

        // B객체 사용
        a2.m();  // 이때 m()은 A2가 재정의한 메서드이다.
        a2.x();
        
        
        // 다형적 변수와 오버라이딩 메서드
        A p = a2;
        

        //p.x(); // 컴파일 오류!
        
        // 주의!!
        p.m(); // p가 실제 가리키는 객체의 클래스가
                // p 클래스의 메서드를 오바리이딩 했다면
                // 그때는 실제 가리키는 객체의 클래스가 오바라이딩한 메서드를 호출한다.
       
        
    }
}
