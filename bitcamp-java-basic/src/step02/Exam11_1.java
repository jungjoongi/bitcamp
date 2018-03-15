// 변수의 사용범위 - 변수를 중복 선언할 수 없다.
package step02;

public class Exam11_1 {
    public static void main(String[] args) {

        int a; // 인스턴스 변수

        static int b; //클래스변수

        public static void main(String[] args) {
            int c; // 로컬변수
        }
    }
}

// 강사님 주석 참고!