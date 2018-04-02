package step14.ex3;


// 클래스는 여러개의 규칙을 이행할 수 있다!
public class Exma02 implements B, C {
    public void m1() {} // B인터페이스뿐만 아니
    public void m2() {} // B의 수퍼인터페이스의 메서드까지 구현해야한다.
    public void m3() {}
    
    
}
