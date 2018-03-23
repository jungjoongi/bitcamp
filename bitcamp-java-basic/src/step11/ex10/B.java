package step11.ex10;

public class B extends A {
    
    static void m(int a, int b, int c) {
        System.out.println("m(int,int,int)");
        B.m(); // 부모클래스의 m()을 호출
        B.m(100, 200, 300);
    }
}
