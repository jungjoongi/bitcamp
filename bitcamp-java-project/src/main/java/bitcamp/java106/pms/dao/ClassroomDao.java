package bitcamp.java106.pms.dao;

import java.util.List;

import bitcamp.java106.pms.domain.Classroom;

public interface ClassroomDao {

    public int delete(int no);
    public List<Classroom> selectList();
    public Classroom selectOne(int no);
    public int insert(Classroom classroom);
    public int update(Classroom classroom);

}

