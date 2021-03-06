// AOP 적용후
package bitcamp.java106.step13.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam05 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext iocContainer =
                new ClassPathXmlApplicationContext("bitcamp/java106/step13/ex2/application-context-05.xml");
        
        String[] names = iocContainer.getBeanDefinitionNames();
        System.out.println("------------------------");
        for (String name : names) {
            System.out.println(iocContainer.getBean(name).getClass().getName());
        }
        System.out.println("------------------------");
        
        Caller caller = (Caller) iocContainer.getBean(Caller.class);
        caller.test();
    }
}
