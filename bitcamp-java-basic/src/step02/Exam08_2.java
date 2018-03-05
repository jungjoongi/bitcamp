//형변환 - 메모리 크기가 다른 변수의 값을 저장할 때
package step02;

public class Exam08_2 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 200;
        int i = 30_0000;
        long l = 400_0000_0000L;
        char c = 50000;

        byte b2;
        short s2;
        int i2;
        long l2;
        char c2;

        s2 = b;
        i2 = s;
        l2 = i;

        s2 = b;
        i2 = c;

        
    }
}  


         