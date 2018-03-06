//형변환 - 명시적 형변환이 가능한 경우
package step02;

public class Exam08_7 {
    public static void main(String[] args) {

    char ch;
    int i = 0x41;
    ch = (char)i;

    // 그 외에는 형변환 불가
    boolean bool;
    bool = (boolean) 1; // 컴파일 오류!

    // -> 문자열을 정수나 부동소수점, 문자, boolean 값으로 변환할 수 없다.
    boolean v1 = (boolean) "true";
    ch v2 = (char)"가";
    int v3 = (int) "123";
    float v4 = (int) "3.14f";
    }
}  