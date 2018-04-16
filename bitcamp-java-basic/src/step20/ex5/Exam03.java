package step20.ex5;


public class Exam03 {
    public static void main(String[] args) {
        Class clazz = MyClass3.class;
        MyAnnotation2 obj = (MyAnnotation2)clazz.getAnnotation(MyAnnotation2.class);
        
        System.out.println(obj.v1()[0]);
        System.out.println(obj.v2()[0]);
        System.out.println(obj.v3()[0]);
    }
}
