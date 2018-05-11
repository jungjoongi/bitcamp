// 서블릿 만들기
package step01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step01/exam03")
public class Exam03 extends javax.servlet.GenericServlet {
    private static final long serialVersionUID = 1L;
    ServletConfig config;
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Exam02.service()");
    }
}
