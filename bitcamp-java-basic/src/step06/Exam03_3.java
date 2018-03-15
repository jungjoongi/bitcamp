// 
package step06;
import java.util.Scanner;
class MyObject {
int a;
int b;
}
public class Exam03_3 {

    // main()에서 만든 int a와 int b를 바꾸고 싶다면,
    // primitive data type값을 직접 넘기지 만ㄹ고
    // 객체에 담아 넘겨라
    static void swap(MyObject ref){
        System.out.printf("swap(): redf = %d, ref.b=%d\n", ref.a, ref.b);
        int temp = ref.a;
        ref.a = ref.b;
        ref.b = temp;
        System.out.printf("swap(): redf = %d, ref.b=%d\n", ref.a, ref.b);
        

    }



    public static void main(String[] args) {
        // MyObject 설계도에 따라 int a와 int b 메모리를 만든다.
        // 그리고 그 메모ㅓ리 (인스턴스 = 객체)의 주소를 ref변수에 저장한다.
        MyObject ref = new MyObject();
        ref.a = 100;
        ref.b = 200;

        swap(ref);
        System.out.printf("main(): a = %d, b=%d\n", ref.a, ref.b);
        

        //a, b변수가 들어 있는 인스톤스 (객체 = 메모리)의 주소를
        // swap()에 넘긴다. -> 그래서 "call by reference"인 것이다.

        
    }
}
// call by value
// -> 자바에서는 primitive data type인 경우 
//    메서드를 호출할 때 값을 넘긴다.
// -> 자바에서는 primitive data type 에 대해서
//    메모리 주소를 넘기는 방법이 없다.