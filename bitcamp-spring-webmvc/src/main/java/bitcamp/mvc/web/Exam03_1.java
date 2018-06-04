package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping("/exam03_1")
public class Exam03_1 {
 
    @RequestMapping("m1")
    @ResponseBody
    public String m1() {
        return "Exam03.m1()";
    }
}
