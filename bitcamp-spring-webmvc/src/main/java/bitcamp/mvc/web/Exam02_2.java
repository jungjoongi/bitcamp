package bitcamp.mvc.web;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bitcamp.mvc.dao.BoardDao;

@Controller()
@RequestMapping("/exam02_2")
public class Exam02_2 {
    
    //@Autowired BoardDao boardDao;
    BoardDao boardDao;
    ServletContext servletContext;
    
    @Autowired
    public void setBoardDao(BoardDao boardDao) {
        this.boardDao = boardDao;
    }
    
    @Autowired
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @RequestMapping("m1")
    @ResponseBody
    public String m1() {
        return this.servletContext.getContextPath();
    }
    
    @RequestMapping("m2")
    @ResponseBody
    public String m2() {
        return "Exam02_2.m2()";
    }
}
