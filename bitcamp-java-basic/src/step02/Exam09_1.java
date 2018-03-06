// 배열 - 배열선언과 사용
package step02;

public class Exam09_1 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // C++ / JAVA 스타일
        int arr2[] = new int[5]; // ok! C스타일

        // 배열 메모리 접근방법 0부터 시작~
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;

        arr[5] = 600; // 컴파일 할때에는 인덱스가 유효한지 알수없다.
                      // 실행할때 오류가 발생한다.
    }
}  
