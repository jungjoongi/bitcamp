package step25.ex2;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Exam02_list {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC 드라이버 로딩 및 등록완료!");


        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");

        System.out.println("DBMS 연결됨");

        PreparedStatement stmt = con.prepareStatement("select bno,titl,rdt from ex_board");
        ResultSet rs = stmt.executeQuery();

        
        while (rs.next()) {
            System.out.printf("%d,%s,%s\n",
                rs.getInt("bno"),
                rs.getString("titl"),
                rs.getDate("rdt"));
        }
        rs.close();
        stmt.close();
        con.close();
    }

}
