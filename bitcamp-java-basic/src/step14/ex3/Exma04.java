package step14.ex3;


// 클래스는 여러개의 규칙을 이행할 수 있다!

// 인터페이스!
// 리턴값이 다른 메서드를 여러개 정의할 수 없다!
// 고로 아래와 같이 오류발생!
public class Exma04 implements C, D2 {
    public void m3() {}
    public int m3() {} // B의 수퍼인터페이스의 메서드까지 구현해야한다.
    
    
}
