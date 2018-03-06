// 배열 - 배열 초기화
package step02;

public class Exam09_2 {
    public static void main(String[] args) {
        //배열선언
        int[] arr = new int[5]; 

        // 배열 메모리를 0으로 초기화
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 0;

        // arr[5] = 600; // 컴파일 할때에는 인덱스가 유효한지 알수없다.
                      // 실행할때 오류가 발생한다.


//      1)
        int[] arr1 = new int[]{0, 0, 0, 0, 0};  // ok
        int[] arr2 = {0, 0, 0, 0, 0};
        arr2 = new int[]{0, 0, 0, 0, 0};

//      2)
        int[] arr3;
        arr3 = new int[]{0, 0, 0};

        int[] arr5;
        arr5 = {0, 0, 0, 0, 0}; // 강사님 주석 참고
    }
}  
//배열 선언 동시에 초기화
// 1)데이터 타입[] 변수명 = new 데이터타입[]{값, 값, 값}
//   ex) int[] arr = new int[]{1, 2, 3, 3, 4}
//   개수를 지정하지 않고 초기화한 개수만큼 배열이 만들어짐
//   - 다음과 같이 new 삭제가능
//   ex) unt[] arr = {10, 20, 30};

// 2)배열 선언 후 따로 배열 초기화 문장실행
