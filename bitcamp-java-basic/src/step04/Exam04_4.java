// 비트 이동 연산자 : 응용 I
package step04;

public class Exam04_4 {
    public static void main(String[] args) {
        int i = 0x27a130ff;
        int a, b, c, d;
        System.out.println(Integer.toHexString(i));
        // 0010_0111_1010_0111_0011_0000_1111_1111
        a = i >> 24;
        b = (i >> 16) & 0xff;
        c = (i >> 8) & 0xff;
        d = i & 0xff;
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toHexString(b));
        System.out.println(Integer.toHexString(c));
        System.out.println(Integer.toHexString(d));
        
        
        

    // i 변수에 들어있는 값을 1바이트씩 짤라서 16진수로 출력하라.

    }
}