package step15.ex2;
// 인터페이스에 특정 메서드만 구현하고 싶을 때?

public abstract class Exam03 implements Servlet {
    public void init() {}

    public void destroy() {}

    public String getServletInfo() {return null;}

    public String gerServlerconfig() {return null;}
}
