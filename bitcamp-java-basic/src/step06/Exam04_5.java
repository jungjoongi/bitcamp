// 메서드 : 스택 메모리 응용 II - 재귀호출
package step06;
import java.util.Scanner;

public class Exam04_5 {


    static int sum(int value) {
        if (value == 1)
            return 1;

            return value + sum(value - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(100000));
        
        
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