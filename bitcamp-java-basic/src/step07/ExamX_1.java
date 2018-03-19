// 클래스 용도 - 사용자 정의 데이터 타입을 만들 때 사용
package step07;

public class ExamX_1 {
    public static void main(String[] args) {
 

        Score score = new Score();
        
        // 클래스로 만든 메모리는 레퍼런스를 통해 접근한다.
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        score.sum = score.kor + score.eng + score.math;
        score.average = score.sum / 3f;
        
        System.out.printf("%s, %d ,%d, %d, %d, %.1f\n",
                score.name, score.kor, score.eng, score.math,
                score.sum, score.average);  
        
    }
}