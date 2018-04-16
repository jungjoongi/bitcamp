package step21.ex2;

public class Calculator3 {
    
    // 이 메서등서 어떤 예외가 발생할 숭 ㅣㅆ는지 호출자가 알 수 있도로
    // 메서드 선언부에 선언해야한다.
    public static int compute(String op, int a, int b) {
        switch (op) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        case "%": return a % b;
        default :
            // 유효하지 않은 연산자인 경우에 throws 명령을 이용하여 호출자에게 오류 상황을 알린다.
            throw new RuntimeException("해당 연산자를 지원하지 않습니다.");
        }
    }

}
