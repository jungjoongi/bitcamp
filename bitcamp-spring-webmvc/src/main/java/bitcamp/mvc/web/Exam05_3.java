package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bitcamp.mvc.vo.Board;

@Controller()
@RequestMapping("/exam05_3")
public class Exam05_3 {
    
    @GetMapping(value="m1")
    @ResponseBody
    public String m1(Board board) {
        return String.format("m1(): no=%d, title=%s, content=%s", board.getNo(), board.getTitle(), board.getContent());
    }
    
    @GetMapping(value="m2")
    @ResponseBody
    public String m2(Board board, String writer) {
        return String.format("m2(): no=%d, title=%s, content=%s, writer=%s",
                            board.getNo(), board.getTitle(), board.getContent(), writer);
    }
    
    @GetMapping(value="m3")
    @ResponseBody
    public String m3(Board board) {
        return String.format("m3(): %s", board);
    }
}
