// 스프링 IoC컨테이너 사용
package bitcamp.java106.step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exam03 {

    public static void main(String[] args) {
        ApplicationContext ionContainer = null;
        
        
        ionContainer = new AnnotationConfigApplicationContext(AppConfig.class);
        
        
        Car car = (Car)ionContainer.getBean("c1");
        System.out.println(car);

    }

}
