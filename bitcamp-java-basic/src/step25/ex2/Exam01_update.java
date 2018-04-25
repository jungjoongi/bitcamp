package step25.ex2;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam01_update {
    
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
        
        
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
        
        System.out.println("DBMS 연결됨");

        PreparedStatement stmt = con.prepareStatement("update ex_board set titl=?, cont=?, rdt=now() where bno=?");
        
        stmt.setString(1, title);
        stmt.setString(2, content);
        stmt.setString(3, no);
        
        int count = stmt.executeUpdate();
        
        System.out.printf("%d개 입력 성공!", count);
        
        stmt.close();
        con.close();
    }
    
}
