package bitcamp.java106.pms.support;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;

public class WebApplicationContextUtils {
    public static Map<ServletContext, ApplicationContext> containers = new HashMap<>();

        static ApplicationContext iocContainer;
    
    
    // 웹 애플리케이션에서 사용할 IoC 컨테이너를 꺼내고 싶다면
    // 파라미터에 웹 어플리케이션 정보를 담고있는 ServletContext를 넘겨줘야 한다.
    public static ApplicationContext getWebApplicationContext(ServletContext ctx) {
        return containers.get(ctx);
    }
//    public static void setApplicationContext()
}
