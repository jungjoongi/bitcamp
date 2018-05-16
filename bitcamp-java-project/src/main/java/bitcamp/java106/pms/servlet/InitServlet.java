// 서블릿 컨테이너가 실행하는 서버 프로그램
package bitcamp.java106.pms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bitcamp.java106.pms.AppConfig;

// 하는 일:
// => Spring IoC 컨테이너를 준비한다. 
@WebServlet(
        urlPatterns="/initServlet",
        loadOnStartup=1)  
@SuppressWarnings("serial")
public class InitServlet extends HttpServlet {
    
    
    static ApplicationContext iocContainer;
    
    public static ApplicationContext getApplicationContext() {
        return iocContainer;
    }
    
    @Override
    public void init() throws ServletException {
        iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}







