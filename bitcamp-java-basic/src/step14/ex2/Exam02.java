// 인터페이스의 모든 메서드는 public이기때문에 public보다 적게 공개할 수 없다.
package step14.ex2;

public class Exam02 implements A3 {
    void m1() {} // 여기서는 public 생략이 아님!! public보다 공개범위를 줄일 수 없다! 
    public void m2() {}
}
