// Controller 규칙에 따라 메서드 작성
package bitcamp.java106.pms.controller.calculator;

import java.util.Scanner;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.controller.Controller;

@Component("calc")
public class calculator implements Controller {
    Scanner keyScan;
    
    public calculator(Scanner scanner) {
        this.keyScan = scanner;
    }
    
    
    public static void compute(String op, int a, int b) {
        switch (op) {
        case "+": System.out.printf("%d + %d = %d", a, b, a+b);
        break;
        case "-": System.out.printf("%d - %d = %d", a, b, a-b);
        break;
        case "*": System.out.printf("%d * %d = %d", a, b, a*b);
        break;
        case "/": System.out.printf("%d / %d = %d", a, b, a/b);
        break;
        case "%": System.out.printf("%d % %d = %d", a, b, a%b);
        break;
        default :
            throw new RuntimeException("해당 연산자를 지원하지 않습니다.");
        }
    }
    
    public void service(String menu, String option) {
       
        System.out.print("식을 입력하세요?");
        String[] calc = keyScan.nextLine().split(" ");
        int a = Integer.parseInt(calc[0]);
        int b = Integer.parseInt(calc[2]);
        String op = calc[1];
        
        compute(op,a,b);
        
        

    }
}

//ver 23 - @Component 애노테이션을 붙인다. ClassroomDao를 받도록 생성자 변경.
//ver 22 - ClassroomDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 20 - 클래스 추가
