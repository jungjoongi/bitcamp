// 증감연산자 : 후위post-fix 증감 연산자
package step04;

public class Exam06_2 {
    public static void main(String[] args) {
        int i = 2;

        i--;
        i--;
        // 현재 위치에 i 값을 놓고
        // i 메모리 값을 1 증가시킨다.
        System.out.println(i);
        System.out.println(i--);
        System.out.println(i);
        
        
    }
}