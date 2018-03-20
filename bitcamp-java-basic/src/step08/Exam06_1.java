// 초기화 블록 - 인스턴스 블록
package step08;

public class Exam06_1 {
    static class A {
        int a;
        int b;
        
        { // 아무 이름없이 선언하는블록이 "초기화 블록"이다.
          // 인스턴스를 생성한 후, 생성자를 호출하기 전에 자동으로 실행한다.
          System.out.println("{}11111");
            
            
        }
        
        A() {
            System.out.println("A()");
            
        }
        
        { // 아무 이름없이 선언하는블록이 "초기화 블록"이다.
            // 인스턴스를 생성한 후, 생성자를 호출하기 전에 자동으로 실행한다.
            System.out.println("{}22222");
        
              
        }
    }
    
    public static void main(String[] args) {
        A obj1 = new A();
    }

}
