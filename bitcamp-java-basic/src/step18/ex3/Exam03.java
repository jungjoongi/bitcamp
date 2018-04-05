package step18.ex3;

import java.lang.reflect.Method;

public class Exam03 {
    public static void m1() {}
    public void m2() {}
    protected void m3() {} 
    void m4() {}
    private void m5() {}
        
    public static void main(String[] args) throws Exception {
        Class clazz = Exam03.class;
        Method m = clazz.getMethod("m2+");
        System.out.println(m.getName());
    }
}
