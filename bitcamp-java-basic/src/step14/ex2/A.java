package step14.ex2;

public interface A {
    // 문법 1:
    public void m1();
    
    
    // 문법2:
    // -> 무조건 public이기때문에 생략해도된다!!
    void m2();

    // private void m3(); // 컴파일 오류!
    // protected void m3(); // 컴파일 오류!
}
