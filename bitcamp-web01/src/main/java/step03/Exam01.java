package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/step03/exam01")
public class Exam01 extends GenericServlet {
   
    private static final long serialVersionUID = 1L;

    @Override
    public void service(
            ServletRequest request, 
            ServletResponse response) throws ServletException, IOException {
        // 클라이언트 에게 응답하는 작업과 관련된 도구들이 서블릿리스펀스 객체에 보관되어 있다.
        // 특히 클라이언트에게 데이터를 출력할 때 사용할 출력스트림 객체도 이 객체에 들어있다.
        // 이 객체에 들어있는 출력 스트림을 사용하여 데이터를 출력하면 클라이언트로 보내질 것이다.
        // 주의,
        // =>
        // 
        PrintWriter out = response.getWriter();
        out.println("hello");
        out.println("안녕하세요");
    }
}
