package step25.ex6;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// 의존 라이브러리 추가
// -mavreoisutory.com 검색하여 build.gradle파일에 추가한다.
public class Exam01_3 {
    public static void main(String[] args) throws Exception {

        InputStream inputStream = Resources.getResourceAsStream(
                "step25/ex6/mybatis-config03.xml");

        
        SqlSessionFactory factroy = 
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factroy.openSession();
        
        List<Board> list = sqlSession.selectList("BoardMapper.selectBoard");
        for (Board board : list) {
            System.out.printf("%d, %s, %s, %s\n",
                    board.getNo(),
                    board.getTitle(),
                    board.getContent(),
                    board.getRegisteredDate());
        }
        
        sqlSession.close();
        
    }
}
