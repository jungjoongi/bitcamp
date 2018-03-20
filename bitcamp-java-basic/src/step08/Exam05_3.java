// 변수 초기화 - 초기화 문장
package step08;

public class Exam05_3 {
    static class A {
        // 변수 선언과 동시에 값을 저장하는 것을 "변수 초기화 문장"이라 부른다.
            int a = 200;
            
            A() {
                this.a = 300;
                
            }
    }
    public static void main(String[] args) {
        
        // 클래스 변수는 생성되는 순간 0으로 자동 초기화 된다.
        
        A obj1 = new A();
        System.out.println(obj1.a);

    }

}
