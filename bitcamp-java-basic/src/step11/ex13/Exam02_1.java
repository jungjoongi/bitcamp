package step11.ex13;

import step11.ex13.sub.B;
import step11.ex13.sub.C;

public class Exam02_1 extends C {
    public static void main(String[] args) {
        A obj1 = new A();
        
        obj1.privateVar = 100; // 오직 클래스 안에서만 사용가능!
        obj1.defaoltVar = 100; // ok!! 이 클래스는 A클래스와 같은 패키지에 소속되어있다.
        obj1.protectedVar = 100; // ok!! 비록 이 클래스가 자식클래스는 아니지만 같은 패키지에 소속되어있다.
        obj1.publicVar = 100;
        
        B obj2 = new B();
        obj1.privateVar = 100; // 오직 클래스 안에서만 사용가능!
        obj1.defaoltVar = 100; // ok!! 이 클래스는 A클래스와 같은 패키지에 소속되어있다.
        obj1.protectedVar = 100; // ok!! 비록 이 클래스가 자식클래스는 아니지만 같은 패키지에 소속되어있다.
        obj1.publicVar = 100; 
        
        C obj3 = new C();
        obj3.privateVar = 100; // 오직 클래스 안에서만 사용가능!
        obj3.defaultVar = 100; // ok!! 이 클래스는 A클래스와 같은 패키지에 소속되어있다.
        obj3.protectedVar = 100; // ok!! 비록 이 클래스가 자식클래스는 아니지만 같은 패키지에 소속되어있다.
        obj3.publicVar = 100;
        
        Exam02_1 obj4 = new Exam02_1();
//        obj4.privateVar = 100; 
//        obj4.defaultVar = 100;
        obj4.protectedVar = 100; 
        
    }
}
 