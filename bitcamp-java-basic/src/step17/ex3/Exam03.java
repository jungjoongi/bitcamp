package step17.ex3;

public class Exam03 {

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
            System.out.println(Exam03.this.value);
        }
    }
    public static void main(String[] args) {
        Exam03 obj = new Exam03();
        obj.setValue(200);

        Inner obj2 = obj.new Inner();
        
    }
}
