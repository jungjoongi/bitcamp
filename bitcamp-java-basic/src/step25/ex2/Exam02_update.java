package step25.ex2;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exam02_update {
    
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);   
        System.out.print("변경할 게시물 번호? ");
        String no = keyScan.nextLine();
        
        System.out.print("제목? ");
        String title = keyScan.nextLine();

        System.out.print("내용? ");
        String content = keyScan.nextLine();
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC 드라이버 로딩 및 등록완료!");
        
        
        // 2) DBMS에 연결하기
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
        
        System.out.println("DBMS 연결됨");

        // 3) sql문을 서버에 보낼 객체를 얻는다.
        Statement stmt = con.createStatement();
        
        String sql = String.format("update ex_board set titl='%s', cont='%s', rdt=now() where bno=%s",
                title, content, no);
        
        // 4) Statement 객체를 사용하여 DBMS에 SQL문을 보낸다.
        int count = stmt.executeUpdate(sql);
        System.out.printf("%d개 입력 성공!", count);
        
        // 자원해제
        // -> 파일과 마찬가지로 DBMS에 연결한 후 더이상 사용하지 않으면 연결을 해제해야 한다.
        stmt.close();
        con.close();
    }
    
}
