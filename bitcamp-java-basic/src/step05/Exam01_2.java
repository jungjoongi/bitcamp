package step05;

public class Exam01_2 {
    public static void main(String[] args) {
        int age = 17;

        // 1) if (조건) {문장1; 문장2;}
        if(age >= 19) 
            System.out.println("성인이다.");
            System.out.println("군대가야한다.");
            System.out.println("일해야 한다.");
            System.out.println("세금 납부해야 한다.");

            System.out.println("-----------------");

            if(age >= 19) {
                System.out.println("성인이다.");
                System.out.println("군대가야한다.");
                System.out.println("일해야 한다.");
                System.out.println("세금 납부해야 한다.");
            }
    }
}