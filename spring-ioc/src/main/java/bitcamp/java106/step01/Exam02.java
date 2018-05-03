// 스프링 IoC컨테이너 사용
package bitcamp.java106.step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Exam02 {

    public static void main(String[] args) {
        ApplicationContext ionContainer = null;
        
        
        ionContainer = new FileSystemXmlApplicationContext(
                "file:\\Users\\zx362\\git\\bitcamp\\spring-ioc\\src\\main\\java\\bitcamp\\java106\\step01\\application-context.xml");
        
        
        Car car = (Car)ionContainer.getBean("c1");
        System.out.println(car);

    }

}
