// 흐름제어문 - if ~ else 문
package step05;



public class Exam01_4 {
    public static void main(String[] args) {
        int age = 17;

        if (age < 19)
            System.out.println("미성년입니다.");

        // elase문을 사용하는 아주 모범적인 사용
        if (age >= 19)
            System.out.println("성인입니다.");
        else
            System.out.println("미성년입니다");

        // => 블록에 들어있는 문장은 if문에 소속되기 때문에 상관없다.
        if (age >= 19) {
            System.out.println("성인입니다.");
            System.out.println("==============");
        }
        else
            System.out.println("미성년입니다.");
            
    }
}