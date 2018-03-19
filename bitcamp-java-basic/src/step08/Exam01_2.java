// 인스턴스 변수 응용 - 성적 데이터 저장할 메모리 만들기
package step08;

public class Exam01_2 {

    public static void main(String[] args) {
        class Score {
            // 강사님 주석 참고
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float average;
        }
        Score s1 = new Score(); // 1명분의 성적 데이터를 저장 메모리
        Score s2 = new Score(); // 1명분의 성적 데이터를 저장 메모리
        Score s3 = new Score(); // 1명분의 성적 데이터를 저장 메모리

        s1.name = "홍길동";
        s1.kor = 51;
        s1.eng = 100;
        s1.math = 90;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.average = s1.sum / 3f;

        s2.name = "임꺽정";
        s2.kor = 100;
        s2.eng = 100;
        s2.math = 90;
        s2.sum = s2.kor + s2.eng + s2.math;
        s2.average = s2.sum / 3f;
        s3.name = "유관순";
        s3.kor = 10;
        s3.eng = 80;
        s3.math = 55;
        s3.sum = s3.kor + s3.eng + s3.math;
        s3.average = s3.sum / 3f;


    }
}

