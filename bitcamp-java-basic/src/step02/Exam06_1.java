//문자 변수 - 값 할당
package step02;

public class Exam06_1 {
    public static void main(String[] args) {
        // 0~65535까지의 UTF-16 코드 값을 저장하는 변수
        char c;
        c = 0;
        System.out.println(c);

        c = 65535;
        System.out.println(c);

        c = -1;
        c = 65536;

    }
}
