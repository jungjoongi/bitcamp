//키보드 입력 받기 - 응용
package step02;

public class Exam02_2 {
    public static void main(String[] args) {
        
    java.io.InputStream keyboard = System.in;

    java.util.Scanner keyScan = new java.util.Scanner(keyboard);

    // 팀 멤버의 정보를 입력받아 출력하라.
    // 이름, 전화, 이메일, 나이, 재직여부
    System.out.print("이름? ");
    System.out.println(keyScan.nextLine());

    System.out.print("전화 ");
    System.out.println(keyScan.nextLine());

    System.out.print("이메일 ");
    System.out.println(keyScan.nextLine());

    System.out.print("나이 ");
    System.out.println(keyScan.nextLine());

    System.out.print("재직여부 ");
    System.out.println(keyScan.nextLine());
        

    }
}