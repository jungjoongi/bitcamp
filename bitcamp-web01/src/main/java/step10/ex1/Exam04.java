//쿠키 : 한글 데이터 꺼내기 
package step10.ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ex1/exam04")
public class Exam04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //쿠키 받기
        // => 쿠키는 서버가 요청하지 않아도 웹브라우저에게 무조건 보낸다.
        //    물론 웹서버가 웹브라우저에 쿠키를 보낼 떄 조건에 따라 웹서버에 보낸다.
        
        // 1) 쿠키 가져오기
        Cookie[] cookies = request.getCookies();
        
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("클라이언트가 보낸 쿠키들");
        
        for (Cookie cookie : cookies) {
            out.printf("%s=%s\n", cookie.getName(), URLDecoder.decode(cookie.getValue(), "UTF-8"));
            // 만약 웹브라우저가 보낸 쿠키의 값이 URL인코딩 되어있다면 직접 URL인코딩 해야한다.
            // 직접 URL디코딩을 해야한다.
            // Tomcat9이상은 상관없지만 그 이하버전은 반드시 해야한다.
        }
        
    }
}