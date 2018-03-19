// 클래스 변수
package step08;

public class Exam01_3 {

        static class A { // 지금 앞에 붙은 static은 신경쓰지말고
            // 강사님 주석참고
            // 클래스 변수 = 스태틱 변수
            static int v1;
            static boolean v2; 
        }                         // 
            public static void main(String[] args) {
            
        A.v1 = 100;
        A.v2 = true;
        
        System.out.printf("%d, %b\n", A.v1, A.v2);
        
    }
}

