package step07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step07/exam01")
public class Exam01 extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    
    public Exam01() {
        System.out.println("step07.Exam01() 호출!");
    }
    
    @Override
    public void init() throws ServletException {
        // 서블릿 컨테이너가 init를 호출하면
        // 그 메서드가 이 메서드를 호출한다.
        // 따라서 서블릿이작업하는데 필요한 자원을 준비시키고싶다면
        // 이 메서드를 오버라이딩 하면 된다.
        System.out.println("step08.Exam01.init() 호출!");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        System.out.println("step08.Exam01.doGet() 호출!");
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("hello!");
    }
}
