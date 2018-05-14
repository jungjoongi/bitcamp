package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/step03/exam05")
public class Exam05 extends GenericServlet {
   
    private static final long serialVersionUID = 1L;

    @Override
    public void service(
            ServletRequest request, 
            ServletResponse response) throws ServletException, IOException {
        
        String name = request.getParameter("name");
        request.setCharacterEncoding("UTF-8");
        int age = Integer.parseInt(request.getParameter("age"));

        response.setContentType("text/plan; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.printf("이름=%s\n", name);
        out.printf("나이=%d\n", age);
    }
}
