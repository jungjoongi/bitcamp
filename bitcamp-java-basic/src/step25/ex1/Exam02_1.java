package step25.ex1;

import java.sql.DriverManager;

public class Exam02_1 {
    
    public static void main(String[] args) throws Exception {
        // 1) JDBC 드라이버 로딩
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC 드라이버 로딩 및 등록완료!");
        
        
        // 2) DBMS에 연결하기
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
        System.out.println("DBMS 연결됨");
        
        // 자원해제
        // -> 파일과 마찬가지로 DBMS에 연결한 후 더이상 사용하지 않으면 연결을 해제해야 한다.
        
        
        con.close();
    }
    
}
