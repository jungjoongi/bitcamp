// 메서드 : Heap 메모리 영역
package step06;
import java.util.Scanner;
class MyObject {
    int a;
    int b;
    }
public class Exam04_3 {


    static MyObject getMyObject() {
        //Exam03_3.java에 정의된 MyObject 클래스 사용
        MyObject ref = new MyObject();
        ref.a = 100;
        ref.b = 200;

        return ref;
    }



    public static void main(String[] args) {
        MyObject ref;
        ref = getMyObject();
        System.out.println(ref.a);
        System.out.println(ref.b);
        
        
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