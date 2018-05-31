package bitcamp.java106.pms.dao;

import java.util.List;

import bitcamp.java106.pms.domain.Board;

public interface BoardDao {
    
    public int delete(int no);
    public List<Board> selectList();
    public int insert(Board board);
    public int update(Board board);
    public Board selectOne(int no);
}
