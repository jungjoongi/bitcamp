package step18.ex1;

class A {
    static int i;
    static void m() {i = 100;}
    static {
        System.out.println("A클래스로딩");
    }
}

public class Exam01 {
    public static void main(String[] args)throws Exception {
        // 클래스로딩
        // -> 클래스가 로딩되어있지 않다는 조건
        // 1) 클래스의 스태틱 맴버(변수,메서드중첩클래스)를 사용할때
        // 2) new명령어를 사용해서 인스턴스를 생성하려할때
        // 3) class.forName()을 이용하여 임의로 클래스를 로딩할때
        
        
//        A.i = 100;
//        A.m();
//        new A();
        Class.forName("step18.ex1.A");
        // fully qualified class name
        // fqname
        // qname
        
        
        A obj = null;
        A[] arr = new A[100];
    }
}
