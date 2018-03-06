// 배열 - 배열 레퍼런스와 배열 인스턴스(배열의 비밀)
package step02;

public class Exam09_3 {
    public static void main(String[] args) {
        // 레퍼런스 변수
         int[] arr1;
         
         //new 명령은 메모리를 확보하는 명령이다.
         // - 리턴 갑은 확보된 메모리의 시작 주소이다.
         // - 이렇게 값을 저장하기 위해 확보된 메모리를 "인스턴스"라 부른다.
         arr1 = new int[5];

         arr1[0] = 100; // arr1에 저장된 주소로 찾아가서
                        // 0번째째 항목에 값을 넣어라!

         arr1[1] = 100;  // arr1에 저장된 주소로 찾아가서
                         // 1번째째 항목에 값을 넣어라!
         System.out.println(arr1[0]);
         System.out.println(arr1[1]);

         int a;
        //  System.out.println(a); // 컴파일 오류!

         //하지만 new명령어로 확보된 메모리는 자동으로 0값으로 초기화 된다.
         //따라서 값을 넣지 않고 바로 사용할 수 있다.

         System.out.println(arr1[2]);
         System.out.println(arr1[3]);
         System.out.println(arr1[4]);
        //0으로 초기화되어서 출력됨
    }
}