// 스프링 IoC컨테이너 사용
package bitcamp.java106.step11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam01 {

    public static void main(String[] args) {

        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig01.class);
        
        BeanUtils.printBeanNames(iocContainer);

    }

}
