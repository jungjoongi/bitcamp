// 인스턴스 메서드와 클래스 메서드의 활용 - Date 클래스
package step09;

import java.util.Date;

public class Exam02_4 {

    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        // 인스턴스 메서드 활용
        System.out.println(d1.getYear() + 1900);
        System.out.println(d1.getMonth()+ 1);
        System.out.println(d1.getDate());
        
        // 스태틱 메서드 활용
        long millis = Date.parse("Sat, 12 Aug 1995 13:13:30 GMT");
        System.out.println(millis);
        
        // 실무에서는 java.util.Date대신 이 클래스의 자식 클래스인
        // java.sqp.Date를 쓰기도 한다.
        // 이 클래스는 날짜 데이터를 문자열로 다룰 때yyyy-mm-dd 형식으로 다룬다.
        
        long currMillis = System.currentTimeMillis();
        
        // 생성자 활용
        java.sql.Date today = new java.sql.Date(currMillis);
        
        // 인스턴스 데이터 사용
        String str = today.toString();
        System.out.println(str);
        
        // 스태틱 메서드 활용
        java.sql.Date d = java.sql.Date.valueOf("2018-03-21");
        System.out.println(d);
    }

}
