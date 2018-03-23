// 오버라이딩 문법 검사
package step11.ex11;

public class Exam04 {
    public static void main(String[] args) {
        B2 obj = new B2();
        
        obj.m(100);
        obj.m(1.1f); // 오버로딩이 된다.
        
    }
}
