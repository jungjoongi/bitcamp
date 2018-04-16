package step21.ex3;

import java.util.Scanner;

public class Exam06_1 {
    static void m() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.println("입력> ");
        int value = keyScan.nextInt();
        System.out.println(value * value);
        // 스캐너 객체를 이용하여 입력을 읽어들인다.
        // [코드가 있다고 가정하자.]
        
        // 프로그램을 즉시 종료하는 경우라면,
        // 스캐너를 다 사용한 다음에 굳이 스캐너와 연결된 키보드와 연결을 끊을 필요는 없다.
        // 그러나 365일 24시간 내내 실행되는 시스템이라면, 키보드 입력을 사용하지 않는 동안에는
        // 다른 프로그램에서 사용할 수 있도록
        // 스캐너와 연결된 키보드를 풀어줘야한다.
        // 이것을 "자원해제"라고 부른다.
        // 보통 자원해제시키는 메서드의 이름이 close() 이다
        // 그러나 365일 서버를 돌리는 곳(서버쪽)은 습관적으로 해제시켜주어야 한다.
        keyScan.close();
        
        // 문제는 close();를 실행하기전에 예외가 발생한다면,
        // 제대로 자원을 해제시키지도 못한다는 것이다.
        // 이것을 해결하는 방법은 finally 블록을 사용하는 것이다.
    }

    public static void main(String[] args) {
        // try블록에서 예외가 발생할 수 있는 메서드를 호출한다.
        m();
    }
}
