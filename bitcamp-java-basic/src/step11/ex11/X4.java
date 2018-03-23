package step11.ex11;

public class X4 extends X3 {
    @Override
    void m1() {
        System.out.println("X4의 m1()");
    }
    
    void test() {
        this.m1(); // X4의 m1()
        super.m1(); // X2의 m1()
        this.m2(); // X3의 m2()
        super.m2();
    }
}
