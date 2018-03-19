package step07;
// 사용자 정의 데이터 타입 - 메서드 = 연산자 
public class Score3 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average; 

    /*  다음 연산자는 계산을 수행할 때마다 인
     * 슨턴스의 주소를 파라미터로 받아야 한다.
    public static void calculate(Score3 score) {
        score.sum = score.kor + score.eng + score.math;
        score.average = score.sum / 3f;
     */
        

    // 인스턴스 메서드
    // -> 인스턴스 주소를 파라미터로 받는 것이 아니라,
    // 메서드를 호출할때 (연산자를 사용할 때ㅑ)
    // 메서드 앞에 인스턴스의 주소를 적는다.
    // -> 이 인스턴스의 주소는 내장된this라는 변수에 복사된다.
    // 그래서 파라미터 대신 this를 사용하면 된다.
    // -> 인스턴스 메서드는 static을 붙이지 않는다.
    
    public void calculate() {
        this.sum = this.kor + this.eng + this.math;
        this.average = this.sum / 3f;
    }
}
