// 클래스 변수와 인스턴스 변수 생성 시점과 메모리 영역
package step08;

public class Exam01_5 {

    static class A {
        static int v1;
        int v2; 
    }                         // 
    public static void main(String[] args) {
        A.v1 = 100;
        
        // v2는 인스턴스 번수이기 때문에 사용하기 전에 n ew명령으로 먼저 생성해야 한다.
//        A.v2 = 200; // 컴파일 오류!
        
        A p = new A();
        // v2인스턴스 변수는 인스턴스 주소를 통해 사용해야ㅕ 한다.
        // 클래스 이름으로 사용할 수 없다.
//        A.v2 = 200; // 또 컴파일 오류!
        
        p.v2 = 200; // ok!
        
        // 인스턴스 변수는 인스턴스를 만들 때 마다 생성된다.
        A p2 = new A();
        p2.v2 = 300;


        System.out.printf("A.v1=%d, p.v2=%d, p2.v2=%d\n", A.v1, p.v2, p2.v2);

    }
}

