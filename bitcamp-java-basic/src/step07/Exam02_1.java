// 사용자 정의 데이터 타입 - 메서드  = 연산자
package step07;

public class Exam02_1 {
    public static void main(String[] args) {

        // 사용자 정의 데이터타입의 값을 연산자를 사용하여 다뤄보자!
        Score2 score = new Score2();

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
        Score2.calculate(score);

        System.out.printf("%s, %d ,%d, %d, %d, %.1f\n",
                score.name, score.kor, score.eng, score.math,
                score.sum, score.average);  

    }
}