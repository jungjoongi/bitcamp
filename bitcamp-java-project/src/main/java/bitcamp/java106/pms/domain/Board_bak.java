package bitcamp.java106.pms.domain;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Board_bak implements Serializable {
    private static final long serialVersionUID = 1L;

    private int no;
    private String title;
    private String content;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createdDate;
    
    // 개발?��?�� ?��?�� 객체?�� ?��?��?�� ?��?��?���? ?��?��?�� toString()?�� ?��버라?��?�� ?��?��.
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", createdDate=" + createdDate + "]";
    }
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    
}

//ver 31 - ?��?��?�� ?���? �? count �??�� ?���?
//ver 27 - java.io.Serializable ?��?��?��?��?�� 구현
//ver 24 - setNo() �?�?
//ver 18 - 게시�? 객체?�� 고유 번호(no)�? static �??��(count)�? ?��?��?��?�� ?��?�� ?��?��?��?��. 
// ver 16 - 캡슐?�� ?��?��. 겟터, ?��?�� 추�?.
// ver 13 - ?��록일?�� ?��?��?�� ???��?�� String?��?�� Date?���? �?�?






