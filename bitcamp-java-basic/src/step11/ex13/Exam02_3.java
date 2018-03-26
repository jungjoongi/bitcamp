package step11.ex13;

import java.util.Calendar;

import step11.ex13.sub.B;
import step11.ex13.sub.C;

public class Exam02_3 extends C {
    public static void main(String[] args) {
        
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
       System.out.println(cal1 == cal2);

       // getInstance()의 리턴 값을 확인해보면 다르다는 것을 알 수가 있다.
       // 즉 singleton 기능을 수행하는 메서드가 아니라,
       // 복잡한 Calendar 객체를 대신 생성해주는 factory method로서 역할을 수행한다.
       //
       // 생성자를 protected로 감추고, getInstance()를 public으로 공개하였다.
       // 캡슐화를 응요한 예이다.
       
       
    }
}
 