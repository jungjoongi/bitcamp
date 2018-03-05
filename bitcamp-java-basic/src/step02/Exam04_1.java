//정수 변수
package step02;

public class Exam04_1 {
    public static void main(String[] args) {
        byte b;
        b = -128;
        b = 127;

        short s;
        s = -32768;
        s = 32767;
        int i;
        i = -2147483648;
        i = 2147483647;
        long l;
        l = -9223372036854775808L;
        l = 9223372036854775807L;


        byte b2;
        b2 = 100; // ok
        b2 = 100L; // 컴파일 오류              


    }
}
