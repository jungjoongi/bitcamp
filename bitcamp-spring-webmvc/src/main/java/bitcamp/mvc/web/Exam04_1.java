package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping("/exam04_1")
public class Exam04_1 {
 
    @GetMapping(value="get", params="name")
    @ResponseBody
    public String m1() {
        return "Exam04_1.m1()";
    }

    @GetMapping(value="get", params="age")
    @ResponseBody
    public String m2() {
        return "Exam04_1.m2()";
    }

    @GetMapping(value="get", params= {"name","age"})
    @ResponseBody
    public String m3() {
        return "Exam04_1.m3()";
    }
    
}
