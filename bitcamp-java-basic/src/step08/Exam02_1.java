package step08;

public class Exam02_1 {
    static class A {
        // 1) 클래스 메서드
        //    -> static 붙은 메서드이다.
        //    -> 클래스 이름으로 호출할 수 있다.
        //    -> "스태틱 메서드"라고도 부른다.
        static void m1() {
            System.out.println("m1()");
        }
        
        // 2) 인스터스 메서드
        //    -> 클래스 이름으로 호출할 수 있다.
        //    -> "스태틱 메서드"라고도 부른다.
    void m2() {
    System.out.println("m2()");
        }
    }
    

    public static void main(String[] args) {

        // 클래스 메서드 호출
        // 클래스명.메서드명();
        A.m1(); // ok!!
        
        
        // 인스턴스 메서드는 반드시 인스턴스 메서드를 사용해서 호출한다.
        A obj1 = new A();
        obj1.m2(); // ok!!
        
        A obj2 = null;
        obj2.m2();
    }

}
