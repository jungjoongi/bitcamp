package step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

// 에노테이션이 등장하기 저에는 xml파일에 서블릿 클래스정보를 등록하였다.
// /WEB-INF/web.xml
// web.xml은 웹 애플리케이션의 배치 정보를 담고있는 파일이다.
// 그래서 "deployment Descriptor File"라고 부른다.
// 줄여서 DD File 이라고 부르기도 한다.
// 
public class Exam02 extends GenericServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("step02.Exam02.Service()");
    }
}


