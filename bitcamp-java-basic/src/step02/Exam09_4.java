// 배열 - 배열 레퍼런스와 배열 인스턴스의 관계
//        부제: 가비지와 가비지 컬렉터의 관계
package step02;

public class Exam09_4 {
    public static void main(String[] args) {
    int[] arr1; // 레퍼런스 주소값
        arr1 = new int[]{100, 200, 300}; // 인스턴스 실제저장소

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        //메모리를 사용하고 주소값을 잃어버린 것
        //garbage = 자바에서 사용
         //dangling object = 컴공에서 사용

        //새로운 int 배열을 확보하여 arr 레퍼런스에 그 주소를 저장한다.
        //새 배열을 만들면 이전배열의 주소는 잃어버린다.
        //사용할수 없는 메모리(인스턴스)를 개발자가 임의로 제거할 수 없다.
        arr1 = new int[]{10, 20, 30, 40, 50};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
    }
}