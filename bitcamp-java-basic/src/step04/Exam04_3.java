// 비트 이동 연산자 : >>, >>>, <<
package step04;

public class Exam04_3 {
    public static void main(String[] args) {
        int i = 0b01101001;
        System.out.println(i);
        System.out.println(i >>> 1); // 00110100 | 1 = > 52
        System.out.println(i >>> 2); // 00011010 | 0 = > 26
        System.out.println(i >>> 3); // 00001101 | 0 = > 13
        System.out.println(i >>> 4); // 00000110 | 1 = > 6
        
        // 오른쪽으로 이동 후,
        // 오른쪽 빈자리 : 무조건 0으로 채운다.
        // 왼쪽 경계를 넘어간 비트는 : 짜른다.

        i = 0b11111111_11111111_11111111_10101001;
        System.out.println(i >>> 1); 
        // i = 0b11111111_11111111_11111111_11010100;
        System.out.println(i >>> 2);
        // i = 0b11111111_11111111_11111111_11101010;
        System.out.println(i >>> 3);
        // i = 0b11111111_11111111_11111111_11101010;
    }
}