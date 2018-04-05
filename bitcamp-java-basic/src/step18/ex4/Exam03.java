package step18.ex4;

import java.lang.reflect.Constructor;

public class Exam03 {
    int value;    
    public Exam03(int i) {
        this.value = i;
    }

    public Exam03(String s, int i) {
        System.out.printf("value=%d\n", this.value);
    }

    public static void main(String[] args) {
        Class clazz = Exam03.class;

        Constructor c = clazz.getConstructor(int.class);
        Exam03 obj = (Exam03)clazz.newInstance();
        obj.print();
        


    }
}
