// Object 클래스의 메서드를 오버라이딩 하기 - hashcode
package step11.ex12;

public class Exam02_2 {

    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
        public Score(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.sum = kor + eng + math;
            this.aver = this.sum / 3f;

        }
        
        @Override
        public int hashCode() {
            String value = String.format("%s, %d, %d, %d, %d, %.1f",
                    this.name, this.kor, this.eng, this.math, this.sum, this.aver);
            return value.hashCode();
        }

    }
    public static void main(String[] args) {
        Score s1 = new Score("홍길동", 100, 100, 100);
        Score s2 = new Score("홍길동", 100, 100, 100);
        
        // 같은 값을 가질 때 같은 해시값을 리턴하도록
        // hashcode()를 오버라이딩 했기 떄문에
        // 다음 출력은 같은 해시 값을 리턴할 것이다.
        System.out.printf("%d, %d", s1.hashCode(), s2.hashCode());
        
        // hashCode()의 리턴 값을 비교하여 두 인스턴스의 값이 같은지 알아낼 수도있다.
        System.out.println(s1.hashCode() == s2.hashCode());

    }

}
