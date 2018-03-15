package step05;

public class Exam01_3 {
    public static void main(String[] args) {
        int age = 17;

        // if문의 조건은 반드시 boolean 데이터여야 한다.
        if (true) System.out.println("11111");
        if (false) System.out.println("22222");
        if (10 < 8 + 5) System.out.println("33333");

        // 그 외의 모든 데이터 타입은 컴파일 오류이다. 
        // if (1) System.out.println("22222"); 컴파일 오류!
        // if (0b0110 & 0b0011) System.out.println("22222"); 컴파일 오류!
       
        // ==대신 =를 사용한 경우,(오타)
        int a = 100;
        if (a == 100) System.out.println("55555");
        
        // 다음은 a변수에 100을 넣는다.
        // 그런데 a가 boolean이 아니기 때문에 컴파일 오류가 발생한다.
        if (a = 100) System.out.println("66666");
    }
}