package step11.ex13;

import step11.ex13.sub.B;
import step11.ex13.sub.C;

public class Exam02_2 extends C {
    public static void main(String[] args) {
        
//        Car c1 = new Car(); // 컴파일 오류!
        // 생성자가 private이기 때문에 다른 클래스에 호출불가!
        
        Car c2 = Car.create("티코");
        System.out.printf("%s,%s,%d,%d\n",
                c2.model, c2.maker, c2.cc, c2.valve);
    }
}
 