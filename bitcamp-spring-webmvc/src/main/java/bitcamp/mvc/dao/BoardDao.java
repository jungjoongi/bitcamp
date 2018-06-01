package bitcamp.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import bitcamp.mvc.vo.Board;

@Repository
// 데이터를 처리하는 DAO객체인경우에 구분하기 쉽도록 다음 에노테이션을 사용한다.
// 물론 Component를 사용하도 된다.
public class BoardDao {
    
    public BoardDao() {
        System.out.println("====> boardDao() ");
    }
    ArrayList<Board> list = new ArrayList<>();
    
    public void insert(Board board) {
        list.add(board);
    }
    
    public List<Board> selectList() {
        return list;
    }
}
