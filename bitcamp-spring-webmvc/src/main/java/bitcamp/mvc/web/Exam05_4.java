package bitcamp.mvc.web;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bitcamp.mvc.vo.Member;

@Controller()
@RequestMapping("/exam05_4")
public class Exam05_4 {
    
    @GetMapping(value="m1")
    @ResponseBody
    public String m1(String title, String content, Date createdDate) {
        return String.format("m1(): %s, %s, %s", title, content, createdDate);
    }
    
    @GetMapping(value="m2")
    @ResponseBody
    public String m2(@RequestParam Member member) {
        return String.format("m2(): id=%s, email=%s, password=%s",member.getId(), member.getEmail(), member.getPassword());
    }
    
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        System.out.println("오호라");
        
        // java.lang.String ===> java.sql.Date 변환시켜주는 프로퍼티 에디터 등록
        binder.registerCustomEditor(java.sql.Date.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                this.setValue(Date.valueOf(text));
            }
        });
        
        // java.lang.String ===> bitcamp.mvc.vo.Member 객체로 변환시키는 프로퍼티 에디터 등록
        binder.registerCustomEditor(bitcamp.mvc.vo.Member.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                String[] values = text.split(",");
                Member obj = new Member();
                obj.setId(values[0]);
                obj.setEmail(values[1]);
                obj.setPassword(values[2]);
                this.setValue(obj);
            }
        });
        
    }
    
    
}
