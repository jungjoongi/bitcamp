// 스프링 IoC컨테이너 사용
package bitcamp.java106.step12.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam01 {

    public static void main(String[] args) {

        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "step12/application-context.xml");
        
        BeanUtils.printBeanNames(iocContainer);

    }
}
