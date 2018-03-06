//형변환 - 명시적 형변환이 가능한 경우
package step02;

public class Exam08_6 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100;

        byte b2 = (byte)s;
        System.out.println(b2);
        b2 = (byte)i;
        System.out.println(i);

        // 큰값을 형변환해서 넣으려하면 값이 짤린다.
        int i2 = 300;
        b2 = (byte)i2;
        System.out.println(b2);

    }
}  