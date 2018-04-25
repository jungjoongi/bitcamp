package step25.ex4;

import java.util.List;

public class Exam01_list {

    public static void main(String[] args) throws Exception {
        DataSource dataSource = new DataSource();
        BoardDao boardDao = new BoardDao(dataSource);
        try {
            List<Board> list = boardDao.list();
            for (Board board : list) {

                System.out.printf("%d,%s,%s\n",
                        board.getNo(),
                        board.getContent(),
                        board.getRegisteredDate());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
