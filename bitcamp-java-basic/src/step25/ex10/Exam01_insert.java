package step25.ex10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01_insert {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext(
                        "step25/ex10/application-context.xml");
        
        
        BoardService boardService = iocContainer.getBean(BoardService.class);
        
        Board b1 = new Board();
        b1.setNo(171);
        b1.setTitle("1111");
        b1.setContent("xxxx");
        
        Board b2 = new Board();
        b2.setNo(172);
        b2.setTitle("1111");
        b2.setContent("xxxx");

        Board b3 = new Board();
        b3.setNo(171);
        b3.setTitle("1111");
        b3.setContent("xxxx");
        
        boardService.test2(b1, b2, b3);
        System.out.println("입력성공");
    }
}







