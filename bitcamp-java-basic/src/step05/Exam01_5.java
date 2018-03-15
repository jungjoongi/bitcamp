// 흐름제어문 - else문의 소속
package step05;

public class Exam01_5 {
    public static void main(String[] args) {
        int age = 15;

        //else는 가장 가까운 if에 소속된다.
        //들여쓰기에 속지말라!
        if (age >= 19)
            if(age >= 70)     
                System.out.println("지하철 무임승차 가능합니다.");
        else
            System.out.println("미성년입니다");

        // 만약 else문을 첫 번째 if문에 소속되게 하고 싶다면
        // 다음과 같이 두 번쨰 if문을 블록으로 묶어라!
        if (age >= 19) {
            if(age >= 70)     
                 System.out.println("지하철 무임승차 가능합니다.");
        }
        else
            System.out.println("미성년입니다");

            
    }
}