// URL (Uniform Resource Locator)
package step16.ex2;

import java.net.URL;

public class Exam01 {
    public static void main(String[] args) throws Exception {
        
    //웹상에서 자원의 위치를 표현하는 방법
    URL url = new URL("http://www.bitcamp.co.kr:8080/a/b/hello.html");
    
    System.out.printf("프로토콜: %s\n", url.getProtocol());
    System.out.printf("서버주소: %s\n", url.getHost());
    System.out.printf("프트번호: %s\n", url.getPort());
    System.out.printf("자원경로: %s\n", url.getPath());
    
    }
}
