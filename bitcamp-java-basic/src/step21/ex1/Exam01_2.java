package step21.ex1;

public class Exam01_2 {
    public static void main(String[] args) {
        // 유효하지 않은 연산자를 지정할 때
        int result = Calculator.compute("#", 100, 200);
        
        if (result == -1) {
            System.out.println("유효하지 않은 연산자입니다.");
        } else {
            System.out.println(result);
        }
        
        
        // 아래는 정상적인 결과인데도 유효하지 않는다고 한다.
        result = Calculator.compute("-", 6, 7);
        if (result == -1) {
            System.out.println("유효하지 않은 연산자입니다.");
        } else {
            System.out.println(result);
        }
        
        
    }
}
