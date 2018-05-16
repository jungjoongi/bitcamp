// 파일 업로드
package step05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 웹 브라우저에서 파일을 보낼 떄 POST 방식으로 보내기 떄문에 
// 서블릿에서는 POST요청을 처리해야 한다.
// 그래서 HTTPServlet을 상속받아 만들고,
// doPost()를 재정의 한다.

@WebServlet("/step05/exam01")
public class Exam01 extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) throws ServletException, IOException {
        // POST 요청으로 전송되는 데잍의 문자표를 서블릿 컨테이너에 알려준다.
        // 이렇게 알려줘야지만 getParameter()를 호출할 때,
        // UTF-8 => UTF-16 제대로 바꿀 것이다.
        request.setCharacterEncoding("UTF-8");
        
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String photo = request.getParameter("photo");
        // 출력할 떄 UTF-16 =>
        response.setContentType("text/plain; charset=UTF8");
        PrintWriter out = response.getWriter();
        out.printf("이름=%s\n", name);
        out.printf("나이=%s\n", age);
        out.printf("사진=%s\n", photo);
    }
}

// multipart/form-data 형식으로 데이터 요청


//POST /bitcamp-web01/step05/exam01 HTTP/1.1
//Host: localhost:8888
//Content-Length: 34019
//Cache-Control: max-age=0
//Origin: http://localhost:8888
//Upgrade-Insecure-Requests: 1
//Content-Type: multipart/form-data; boundary=----WebKitFormBoundaryljTOP2BDz6Rb7nfT
//User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.170 Safari/537.36
//Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
//Referer: http://localhost:8888/bitcamp-web01/step05/exam01_test.html
//Accept-Encoding: gzip, deflate, br
//Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
//Connection: keep-alive
//
//------WebKitFormBoundaryljTOP2BDz6Rb7nfT
//Content-Disposition: form-data; name="name"
//
//홍길동
//------WebKitFormBoundaryljTOP2BDz6Rb7nfT
//Content-Disposition: form-data; name="age"
//
//20
//------WebKitFormBoundaryljTOP2BDz6Rb7nfT
//Content-Disposition: form-data; name="photo"; filename="cc3.jpg"
//Content-Type: image/jpeg
//
//����
// .
// .
// .
// ------WebKitFormBoundaryljTOP2BDz6Rb7nfT--