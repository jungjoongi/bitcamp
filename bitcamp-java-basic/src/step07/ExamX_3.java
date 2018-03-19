// 사용자 정의 데이터 타입 - 인스턴스 메서드
package step07;

public class ExamX_3 {
    public static void main(String[] args) {

        // 사용자 정의 데이터타입의 값을 연산자를 사용하여 다뤄보자!
        Score3 score = new Score3();

        // 클래스로 만든 메모리는 레퍼런스를 통해 접근한다.
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        
        // 다음은 Score의 값을 다루는 연산자가 없을 때의 예시이다.
        /*
        score.sum = score.kor + score.eng + score.math;
        score.average = score.sum / 3f;
         */
        
        // 다음은 Score의 값을 다루기 위해 non-instance 메서드를 호출하느 ㄴ예이다.
        // -> non-instance 메서드 = static 메서드 = 클래스 메서드
        /*
        Score2.calculate(score);
         */
        
        // 클래스 메서드를 사용할 때 마다 매번 인스턴스의 주소를 파라미터로 넘겨줘야 했다.
        // 그러나 인스턴스 메서드를 사영하는 순간 파라미터가 아닌
        // 메서드 앞에 인스턴스 주소를 준다.
        // 훨신 소스 코드의 목적을 이해하는데 직관적이다.
        score.calculate(); // 변수뒤에 연산자를 놓는 i++의 예와 비슷하다.
        
        System.out.printf("%s, %d ,%d, %d, %d, %.1f\n",
                score.name, score.kor, score.eng, score.math,
                score.sum, score.average);  

    }
}

// 사용자 정의 데이터 타입에서
// 인스턴스의 값을 다루는 연산자를 정의할 떄는
// 인스턴스 메서드로 만드는 것이 사용하기 편하다.