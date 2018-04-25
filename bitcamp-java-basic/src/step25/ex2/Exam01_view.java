package step25.ex2;

import java.sql.DriverManager;
import java.util.Scanner;

public class Exam01_view {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("조회할 게시물 번호? ");
        String no = keyScan.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC 드라이버 로딩 및 등록완료!");


        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");

        System.out.println("DBMS 연결됨");

        java.sql.Statement stmt = con.createStatement();

        
        java.sql.ResultSet rs = stmt.executeQuery("select bno,titl,cont,rdt from ex_board where bno=" + no);

        
        if (rs.next()) {
            System.out.printf("번호 %d\n", rs.getInt("bno"));
            System.out.printf("제목 %s\n", rs.getString("titl"));
            System.out.printf("내용 %s\n", rs.getString("cont"));
            System.out.printf("등록일 %s\n", rs.getString("rdt"));
        } else {
            System.out.println("해당 번호의 게시물이 없습니다!");
        }
        // 자원해제
        // -> 파일과 마찬가지로 DBMS에 연결한 후 더이상 사용하지 않으면 연결을 해제해야 한다.
        rs.close();
        stmt.close();
        con.close();
        keyScan.close();
    }

}
