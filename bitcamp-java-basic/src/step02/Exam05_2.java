//부동소수점 변수 - 단정도와 배정도
package step02;

public class Exam05_2 {
    public static void main(String[] args) {
        //
        float f;
        double d;

        f = 9876.98679876f;
        d = 9876.98679876f;
        System.out.println(f);
        System.out.println(d);

        f = 9876.98679876f;
        d = 9876.98679876;
        System.out.println(f);
        System.out.println(d);
    }
}
