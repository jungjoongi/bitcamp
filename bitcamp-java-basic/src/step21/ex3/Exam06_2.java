package step21.ex3;

import java.util.Scanner;

public class Exam06_2 {
    static void m() {
        Scanner keyScan = null;
        try {
            keyScan = new Scanner(System.in);

            System.out.println("입력> ");
            int value = keyScan.nextInt();
            System.out.println(value * value);
        } finally {
            System.out.println("스캐너 자원 해제");
            keyScan.close();
        }
    }

    public static void main(String[] args) {
        // try블록에서 예외가 발생할 수 있는 메서드를 호출한다.
        m();
    }
}
