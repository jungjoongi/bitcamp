// 스프링 IoC컨테이너 사용
package bitcamp.java106.step06;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam02 {

    public static void main(String[] args) {

        ApplicationContext iocContainer = null;
        
        iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step06/application-context-02.xml");
        
        BeanUtils.printBeanNames(iocContainer);
        Date date = (Date)iocContainer.getBean("d1");
        
        System.out.println(date);
        
    }

}
