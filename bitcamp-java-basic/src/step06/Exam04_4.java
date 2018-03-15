// 메서드 : 스택 메모리 응용
package step06;
import java.util.Scanner;

public class Exam04_4 {


    static int m1(int value) {
        int r1 = m2(value);
        int r2 = m3(value);
        return r1 + r2;
        
    }
    static int m2(int value) {
        return value + 100;
    }
    static int m3(int value) {
        return value + 200;
        
    }


    public static void main(String[] args) {
        int r = m1(5);
        System.out.println(r);
        
        
    }
}

// 1) main()호출
//    -> JVM Stack : args, ref 변수 생성
// 2) getMyObject() 호출
//    -> JVM Stack : arr 변수 생성
//    -> Heap: MyObject 배열 생성
// 3) getMyObject() 호출 끝
//    -> jVM Stack: getMyObject()관련 멤ㅎ라 arr 변수 제거
//    -> new int[] 배열 주소 리턴
// 4) main() 호출 끝
//    -> JVM Stack: main() 관련 메모리 제거
// 5) JVM 종료
//    -> JVM이 사용한 모든 메모리(Method Area, JVM Stack, Heap)