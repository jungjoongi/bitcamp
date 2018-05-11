package step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//@WebServlet(value="/step02/exam01")
//@WebServlet("/step02/exam01")
//@WebServlet(urlPatterns="/step02/exam01")
// 전부 사용 가능
//여러개 이름 지정할 떄 배열로 사용가능!
@WebServlet(urlPatterns= {"/step02/exam01", "/step02/exam01_ok"})
public class Exam01 extends GenericServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("step02.Exam01.Service()");
    }
}
