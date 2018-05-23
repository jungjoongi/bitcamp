//쿠키 : 클라이언트에 데이터를 보관하는 방법 
package step10.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ex1/exam02")
public class Exam02 extends HttpServlet {
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
            out.printf("%s=%s\n", cookie.getName(), cookie.getValue());
        }
        
        //쿠키? 
        //웹 서버에서  데이터를 보내 웹 브라우저에 저장하는 것
        //웹브라우저는 웹서버로부터 받은 데이터를 보관하다가 웹 서버에 요청할 때마다 다시 보낸다.
        //예) 쿠폰..
        
    }
}