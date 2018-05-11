package step01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class HttpServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 파라미터로 넘어오는 것은 실제로 HTTP 프로토콜을 다룰 수 있는 객체가 넘어온다.
        // 즉 ServletRequest 대신에 그 자식 객체인 HttpServletRequest 가 넘어온다.
        // ServletResponse 대신에 그 자식 객체인 HttpServletReponse 객체가 넘어온다.
        // 따라서 이들 객체로 형변환해도 된다.
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) res;
        
        this.service(httpRequest, httpResponse);
    }
    
    protected void service(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {
        
        String command = request.getMethod();
        
        switch (command) {
        case "GET": doGet(request, response); break;
        case "POST": doPost(request, response); break;
        case "HEAD": doHead(request, response); break;
        default:
            throw new ServletException("해당 명령을 처리할 수 없습니다!");
        }
    }

    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        throw new ServletException("해당 명령을 처리할 수 없습니다!");
    }

    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        throw new ServletException("해당 명령을 처리할 수 없습니다!");
    }

    protected void doHead(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        throw new ServletException("해당 명령을 처리할 수 없습니다!");
    }
    
}
