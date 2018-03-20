// 초기화 블록 - 클래스 블럭 = 스태틱 븕럭
package step08;

public class Exam06_4 {
    
    static class A {
        static int a;
        static void m() {}
        // 스태틱 블록은 클래스가 로딩된 후에 자동으로 실행된다.
        static {
            System.out.println("static{}111111");
        }
        
        static {
            System.out.println("static{}22222");
        }
    }

    
    public static void main(String[] args) throws Exception {
        // 클래스가 로딩되는 경우
        
        // -> 레퍼런스를 선언할 때는 로딩되지 않는다.
        A obj1;
        A obj2;
        
        // 1) 클래서 멤(변수와 메서드)버를 최초로 사용할 때
        // A.a = 100;
        System.out.println("-------------");
        // A.m(); // 둘중 하나 한번밖에 안된다.
        
        System.out.println("*************");
        // 2) 해당 클래스의인스턴스를 최초로 생성할 때
        //    -> 인스턴스를 만들려면 설계도가 있어야 하고,
        //       설계도는 메모리에 로딩되어 있어야 한다.
        //       따라서 설계도가 없으면 즉시 설계도를 로딩할 것이다.
        
        //new A();
        System.out.println("===========");
        // 3) 자바에서 제공하는 도구를 사용하여 강제로 클래스를 로딩시키는 경우\
        Class.forName("step08.Exam06_4$A");
        
        
        
    }

}
