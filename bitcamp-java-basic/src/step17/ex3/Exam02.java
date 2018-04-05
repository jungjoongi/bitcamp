package step17.ex3;

public class Exam02 {

    int value;
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    
    public void tset() {
        Inner innerObj = new Inner();
        innerObj.m();
    }

    class Inner {
        public void m() {
            // non-static 중첩클래스도 인스턴스 멤버이다.
            // 따라서 바깥클래스의 인스턴스 변수에 접근할 수 있다.
            System.out.println(Exam02.this.value);
        }
    }
    public static void main(String[] args) {
        Exam02 obj = new Exam02();
        obj.setValue(100);
        System.out.println(obj.getValue());
        obj.tset();
        
    }
}
