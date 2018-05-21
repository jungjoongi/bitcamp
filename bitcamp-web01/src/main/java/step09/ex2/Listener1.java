package step09.ex2;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener1 implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 서블릿 컨테이너가 시잘될 떄 호출된다.
        ServletContextListener.super.contextInitialized(sce);
        System.out.printf("Listener1.contextInitialized() - %s\n", new Date());
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 서블릿 컨테이너가 종료될때 호출된다.
        ServletContextListener.super.contextDestroyed(sce);
        System.out.printf("Listener1.contextInitialized() - %s\n", new Date());
    }
}
