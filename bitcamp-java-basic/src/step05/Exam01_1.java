package step05;

public class Exam01_1 {
    public static void main(String[] args) {
        int age = 17;

        // 1) if (조건) 문장;
        if(age >= 19) System.out.println("성인이다.");

        // - 문장을 다른 줄에 놓는 경우가 많다.
        if(age >= 19); // 세미콜론을 붙이면 if문 실행이 안됨
            System.out.println("성인이다.");
        // if (조건) 뒤에 문자의 끝을 표시하는 
        // 세미콜론을 사용하지 않도록 조심하라!
    }
}