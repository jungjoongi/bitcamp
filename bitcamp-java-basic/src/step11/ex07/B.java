// 기존의 클래스를 손데지 않고 새 기능만 추가한다.
// 어떻게? 상속문법을 이용한다.
package step11.ex07;


public class B extends A{
    // 인스턴스 변수 추가
    int v2;
    B() {
        super(100);
        System.out.println("B() 생성자!");
    }
}
