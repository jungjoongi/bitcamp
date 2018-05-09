// 스프링 IoC컨테이너 사용
package bitcamp.java106.step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam01 {

    public static void main(String[] args) {

        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step07/application-context-01.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        // 실행오류발생
        // 이유?
        // java.lang.String 값을 java.sql.Date객체로 변환할 수 없어서!
        // 즉 스프링 IoC컨테이너에 String를 Date으로 바꾸는 변환기가 설치되어있지 않다.
        //
        // 스프링 빌트인 프로퍼티 데이터(변환기)
        // => primitive타입 변환기는 기본으로 내정하고 있다.
        // => 따라서 String을 byte.short, int, long, float, double, boolean, char로 바꿀 수 있다.
        
    }

}
