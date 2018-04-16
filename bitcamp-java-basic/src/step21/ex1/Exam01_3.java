package step21.ex1;

public class Exam01_3 {
    public static void main(String[] args) {
        // 유효하지 않은 연산자를 지정할 때
        int result = Calculator2.compute("#", 100, 200);
        
        if (result == -1212121212) {
            System.out.println("유효하지 않은 연산자입니다.");
        } else {
            System.out.println(result);
        }
        
        
        // 아래는 정상적인 결과인데도 유효하지 않는다고 한다.
        result = Calculator2.compute("-", 6, 7);
        if (result == -1212121212) {
            System.out.println("유효하지 않은 연산자입니다.");
        } else {
            System.out.println(result);
        }
        
        // 아래도 정상적인 결과인데도 유효하지 않는다고 한다.
        // 결국 이 문제를 이러한 방법으로 해결할 순 없다
        result = Calculator.compute("+", -2078654356, 866533144);
        if (result == -1212121212) {
            System.out.println("유효하지 않은 연산자입니다.");
        } else {
            System.out.println(result);
        }
    }
}
