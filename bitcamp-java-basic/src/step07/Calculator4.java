//메서드를 분류 - 인스턴스 메서드 사용
package step07;
public class Calculator4 {
    int result = 0;

    // 인스턴스 변수를 다룰 떄에는 인스턴스 메서드를 사용하는 것이 편하다!
    // 왜?
    //  -> 파라미터로 따로 인스턴스의 주소를 받을 피룡가 없기 떄문이다.
    public void plus(int value) {
        // 인스턴스 메서드는 인스턴스의 주소를 this라는 내장 변수에 자동으로 받는다.
        this.result += value;
    }
    public void minus(int value) {
        this.result -= value;
    }
    public void multiple(int value) {
        this.result *= value;
    }
    public void divide(int value) {
        this.result /= value;
    }
}
