package step20.ex5;


public class Exam05 {
    public static void main(String[] args) {
        Class clazz = MyClass5.class;
        MyAnnotation3 obj = (MyAnnotation3)clazz.getAnnotation(MyAnnotation3.class);
        
        System.out.println(obj.v1()[0]);
        System.out.println(obj.v2()[0]);
        System.out.println(obj.v3()[0]);
    }
}
