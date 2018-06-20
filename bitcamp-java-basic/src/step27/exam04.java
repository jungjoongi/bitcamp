// 람다 (lambda)익명클래스와 람다 표현식
package step27;

public class exam04 {

    static interface Calculator {
        void compute(int a, int b);
    }

    static void test(Calculator c) {
        System.out.println(c.compute(100, 200));
    }

    public static void main(String[] args) {


        test((a,b) -> {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        });
    }
}
