
package step18.ex2;

public class Exam03 {
    static class A {
        static class B {}
        class C {}
        public void m() {
            class D {}
        }
        public void m2 () {
            Object obj = new Object() {};
        }
        public static class E {}
        public class F {}
        private class G {}
        protected class H {}
        
    }
    
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("step18.ex2.Exam03$A");
        
        Class[] nestedList = clazz.getDeclaredClasses();
        for (Class nested : nestedList) {
            System.out.println(nested.getName());
        }
    }
}
