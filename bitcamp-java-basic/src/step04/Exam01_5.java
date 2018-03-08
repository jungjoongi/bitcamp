// 산술연산자 : 연산의 결과는 타입
package step04;

public class Exam01_5 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5.5f;
        double d = 6.6;
        char c = 7;

        // byte r1 = b + b;
        // System.out.println(r1); // 컴파일오류!

        // short r2 = s + s;
        // System.out.println(r2); // 컴파일오류!

        short r3 = s + b;
         System.out.println(r3);
        
    }

}