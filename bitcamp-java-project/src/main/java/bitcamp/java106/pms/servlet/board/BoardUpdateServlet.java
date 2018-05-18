package bitcamp.java106.pms.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.servlet.InitServlet;

@SuppressWarnings("serial")
@WebServlet("/board/update")
public class BoardUpdateServlet extends HttpServlet {
    BoardDao boardDao;
    
    public void init() throws ServletException {
        boardDao = InitServlet.getApplicationContext().getBean(BoardDao.class);
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        
        
        
        try {
            Board board = new Board();
            board.setNo(Integer.parseInt(request.getParameter("no")));
            board.setTitle(request.getParameter("title"));
            board.setContent(request.getParameter("content"));
            int count = boardDao.update(board);
            if (count == 0) {
                throw new Exception("<p>해당 게시물이 존재하지 않습니다.</p>");
            }
            
            response.sendRedirect("list");
        } catch (Exception e) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            
            out.println("<meta http-equiv='Refresh' content='1;url=list'>");
            
            out.println("<title>게시물 변경</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>게시물 변경 결과</h1>");
            out.println("<p>변경 실패!</p>");
            out.println("<pre>");
            e.printStackTrace(out);
            out.println("</pre>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

//ver 31 - JDBC API가 적용된 DAO 사용
//ver 28 - 네트워크 버전으로 변경
//ver 26 - BoardController에서 update() 메서드를 추출하여 클래스로 정의.
