package bitcamp.java106.pms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request,
                        HttpServletResponse response) throws ServletException, IOException {
        
        String servletPath = request.getServletPath().replace(".do", "");
        System.out.println(servletPath);
        
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher 요청배달자 = request.getRequestDispatcher(servletPath);
        요청배달자.include(request, response);
        
        String viewUrl = (String)request.getAttribute("viewUrl");
        if (viewUrl.startsWith("redirect:")) {
            response.sendRedirect(viewUrl.substring(9));
        } else {
        요청배달자 = request.getRequestDispatcher(viewUrl);
        요청배달자.include(request, response);
        }
    }
}
