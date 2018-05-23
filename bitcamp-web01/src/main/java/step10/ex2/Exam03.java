//쿠키 : 쿠키를 사용할 범위 정하기
package step10.ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ex2/exam03")
public class Exam03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Cookie cookie1 = new Cookie("c1", "aaa");
        cookie1.setPath("/");
        Cookie cookie2 = new Cookie("c2", "123");
        cookie2.setPath("/bitcamp-web01/step10/ex2");
        
        Cookie cookie3 = new Cookie("c3", "ccc");
        cookie3.setPath("/bitcamp-web01/step10/ex2/exam04");
        
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("쿠키 보냄");
        
        //쿠키? 
        //웹 서버에서  데이터를 보내 웹 브라우저에 저장하는 것
        //웹브라우저는 웹서버로부터 받은 데이터를 보관하다가 웹 서버에 요청할 때마다 다시 보낸다.
        //예) 쿠폰..
        
    }
}