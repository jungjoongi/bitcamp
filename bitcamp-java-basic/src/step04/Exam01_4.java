// 산술연산자 : 연산의 결과는 타입
package step04;

public class Exam01_4 {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        float r = (float)i / (float)j;
        System.out.println(r);

        byte b, b1, b2;
        int i2;

        b = 5;
        b1 = 2;
        i2 = b + b1;
        
        System.out.println(i2);
    }

}