package step25.ex5;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// 의존 라이브러리 추가
// -mavreoisutory.com 검색하여 build.gradle파일에 추가한다.
public class Exam01_1 {
    public static void main(String[] args) throws Exception {

        InputStream inputStream = Resources.getResourceAsStream(
                "step25/ex5/mybatis-config.xml");

        
        // 호출하는 방법
        // SqlSessionFactory 객체를 생성하려면 SqlSessionFactoryBuilder 빌더를 사용해야함
        // SqlSession 객체를 생성하려면 SqlSessionFactory를 사용해야함
        // 왜냐? 인터페이스이기 때문에 (과정이 복잡함)
        SqlSessionFactory factroy = 
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factroy.openSession();
        

        System.out.println("mybatis 준비완료");
        
        sqlSession.close();
        
    }
}
