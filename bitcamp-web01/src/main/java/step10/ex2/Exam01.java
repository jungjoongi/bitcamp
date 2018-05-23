//쿠키 : 유효기간 설정하기
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
@WebServlet("/step10/ex2/exam01")
public class Exam01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Cookie cookie1 = new Cookie("c1", "aaa");
        cookie1.setMaxAge(20); // 유지시간(초)을 설정한다.
        // 유효기간을 설정하면 ㅇ웹브러우저를 닫아도, 컴퓨터를 종료해도 유지된다.
        // 즉 파일시스템(HDD등)에 보관되기 때문에 컴퓨터를 꺼도 유지된다.
        Cookie cookie2 = new Cookie("c2", "123");
        cookie2.setMaxAge(40); // 유지시간(초)을 설정한다.
        Cookie cookie3 = new Cookie("c3", "ccc");
        // 유효기간을 설정하지 않으면 웹 브라우저를 실행하는 동안만 유효하다
        
        //2)응답 헤더에 쿠키 정보를 출력한다
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