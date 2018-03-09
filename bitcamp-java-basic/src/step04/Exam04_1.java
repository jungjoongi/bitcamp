// 비트 이동 연산자 : >>, >>>, <<
package step04;

public class Exam04_1 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i << 1);
        System.out.println(i << 2);
        System.out.println(i << 3);
        System.out.println(i << 4);
        // 왼쪽으로 이동 후,
        // 오른쪽 빈자리 : 0으로 채운다.
        // 왼쪽 경계를 넘어간 비트는 : 짜른다.

        i = 11;
        System.out.println(i << 1); // 22 -> 0001 0110
        System.out.println(i << 2); // 44 -> 0010 1100
        System.out.println(i << 3); // 88 -> 0101 1000
    }
}