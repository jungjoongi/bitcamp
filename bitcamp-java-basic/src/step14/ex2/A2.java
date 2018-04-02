
package step14.ex2;

public interface A2 {
    // 문법 1:
    public void m1() {} // 컴파일 오류!
    
    
    void m2(); // 몸체({})를 구성하지 않아야 한다.
    
    abstract void m3();
    // 메서드 앞에 몸체를 구현하지 않아서 추상메서드이기 때무네 abstract를 쓰지만 생략가능하다!
    
    
}
