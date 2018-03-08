// 산술연산자 : 연산의 결과는 타입
package step04;

public class Exam02_2 {
    public static void main(String[] args) {

        double d1 = 987.6543;
        double d2 = 1.111111;

        double EPSILON = 0.00001;
        System.out.println(Math.abs(d1 + d2) - 988.765411 < EPSILON);
        System.out.println(Math.abs(d1 + d2) - 988.765411 > 0);
      
         


        // double x = 234.765411;
        // double y = 754.0;

        
    }
}