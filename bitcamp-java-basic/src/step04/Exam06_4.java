// 증감연산자 : 후위post-fix 증감 연산자
package step04;

public class Exam06_4 {
    public static void main(String[] args) {
        int i = 2;
        int result = i++ + i++ * i++;
        // 연산자 우선순위
        // 1) ++, --
        // 2) *, /, %
        // 3) +, -
        // 4) =
        // result = 2 + 3 * 4

        System.out.printf("%d, %d\n", i, result);
        
        
    }
}