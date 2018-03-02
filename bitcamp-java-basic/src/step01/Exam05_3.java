package step01;

//정수의 리터럴 III - 크기
public class Exam05_3 {
    public static void main(String[] args) {
        // 정수를 표기할때
        // 표기에따라 표기방법이 다르다
        System.out.println(2147483647);
        System.out.println(-2147483648);
        
        // //4바이트 초과하면 오류
        // System.out.println(2147483648);
        // System.out.println(-2147483649);

        System.out.println(2147483648L);
        System.out.println(-2147483649L);

        // 바이트의 정수 최대값
        // -> 자바에서는 각 데이터 유형에 따라 최대/최소 값을 조회할 수 있도록
        // 특별한 명령을 제공한다.

        System.out.println(Integer.MAX_VALUE); //4바이트 최고
        System.out.println(Integer.MIN_VALUE); //4바이트 최소
        System.out.println(Long.MAX_VALUE); // 8바이트 최고
        System.out.println(Long.MIN_VALUE); // 8바이트 최소

        // 따라서 다음은 크기가 다른 정수이다.

        System.out.println(100); // 4바이트 크기의 정수 값
        System.out.println(100L); // 8바이트 크기의 정수 값       


    }
}

