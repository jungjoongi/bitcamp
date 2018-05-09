// 스프링 IoC컨테이너 사용
package bitcamp.java106.step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam04 {

    public static void main(String[] args) {

        ApplicationContext iocContainer = null;
        
        iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step06/application-context-04.xml");
        
        BeanUtils.printBeanNames(iocContainer);
        
        System.out.println(iocContainer.getBean("c1"));
        
    }

}
