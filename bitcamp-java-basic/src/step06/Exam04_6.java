// 메서드 : 스택 메모리 응용 III - 스택 오버플로우
package step06;

public class Exam04_6 {


    static int sum(int value) {
        /*
        if (value == 1)
            return 1;
        */
        long a1, a2, a3, a4, a5, a6, a7, a8, a9;
        long a11, a12, a13, a14, a15, a16, a17, a18, a19;
        System.out.println(value);
            return value + sum(value - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        
        
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