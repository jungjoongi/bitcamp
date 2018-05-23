//쿠키 : 한글데이터 보내기 
package step10.ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ex1/exam03")
public class Exam03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //쿠키 보내기
        
        // 쿠키 데이터의 조건 :
        // => 쿠키의 데이터는 문자열만 가능하다.
        // => 응답 헤더로 보내기 때문에 반드시 URL인코딩 해야한다.
        // => Tomcat9에서는 한글 데이터를 보내고 받을 수 있다.
        //    만약 Tomcat8이하 버전이나 다른 서블릿 컨테이너를 사용한다면 한글이 꺠질 수 있다.
        //    그런경우에는 URL인코딩 하여 보내라
        Cookie cookie1 = new Cookie("c1", URLEncoder.encode("홍길동", "UTF-8"));
        Cookie cookie2 = new Cookie("c2", URLEncoder.encode("임꺽정", "UTF-8"));
        
        //2)응답 헤더에 쿠키 정보를 출력한다
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("쿠키 보냄");
        
        
    }
}