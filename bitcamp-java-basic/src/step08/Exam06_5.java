// 초기화 블록 - 클래스 블럭 = 스태틱 븕럭
package step08;

public class Exam06_5 {
    
    static class A {
        static float pi;
        static float area(int r) {
            return 2 * pi * r;
        }
        
        static {
            pi = 3.14159f;
        }
    }

    
    public static void main(String[] args) throws Exception {
        System.out.println(A.area(25));
        
        
    }

}
