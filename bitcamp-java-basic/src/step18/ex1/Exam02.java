package step18.ex1;


public class Exam02 {
    static class A{
        static int s_var = 100;
        int i_var = 200;
        static void m() {}
        void i_m() {}
        
        static {
            System.out.println("A클래스 로딩!");
        }
    }
    public static void main(String[] args)throws Exception {
        
        Class<?> clazz = Class.forName("step18.ex1.Exam02$A");
        System.out.println(clazz);
        // 중첩클래스 '클래스명$중첩클래스명" 형식의 이름을 갖는다.
    }
}
