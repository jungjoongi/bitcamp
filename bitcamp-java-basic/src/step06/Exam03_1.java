// 메서드: 가변 파라미터의 단점ㄴ
package step06;
import java.util.Scanner;
public class Exam03_1 {

    static void swap(int a, int b){
        System.out.printf("swap(): a = %d, b=%d\n", a, b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("swap(): a = %d, b=%d\n", a, b);

    }



    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        swap(a, b);

        System.out.printf("main: a = %d, b=%d\n", a, b);
        
    }
}
// call by value
// -> 자바에서는 primitive data type인 경우 
//    메서드를 호출할 때 값을 넘긴다.
// -> 자바에서는 primitive data type 에 대해서
//    메모리 주소를 넘기는 방법이 없다.