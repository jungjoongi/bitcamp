// 논리연산자 : &&, ||, !(not), ^(XOR; exclusive-or)
package step04;

public class Exam03_1 {
    public static void main(String[] args) {


        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        
        System.out.println("================");

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("================");
        
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("================");
        System.out.println(true ^ true); // 값이 다를때~ ex. 남자 + 여자, 어른 + 어린이 등..
        System.out.println(false ^ false);
        System.out.println(true ^ false);        
                
    }
}