// 스프링 IoC컨테이너 사용
package bitcamp.java106.step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {

    public static void main(String[] args) {
        // 스프링 IoC 컨테이너는 ApplicationContext를 구현한다.
        ApplicationContext ionContainer = null;
        
        // ApplicationContext 구현체 종류
        // 1) XML 파일에 작성된 설정정보를 읽어서 처리하는 IoC컨테이너
        //    => ClasspathXmlApplicationContext (자바 classpath에서 xml파일을 찾는다.)
        //    => FileSystemXmlApplicationContext (OS 파일세스템에서 xml 파일을 찾는다.)
        // 2) 클래스 안에 에노테이션을 읽어서 처리하는 IoC컨테이너
        //    => AnnotationCOnfigApplicationContext
        //
        
        // ClasspathXmlApplicationContext 사용
        ionContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step01/application-context.xml");
        
        
        Car car = (Car)ionContainer.getBean("c1");
        System.out.println(car);

        
        car = (Car)ionContainer.getBean("c2");
    }

}
