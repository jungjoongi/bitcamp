package step13.ex1;

import java.util.HashMap;

public class Exam01_4 {
    public static void main(String[] args) {
        HashMap<Object,Object> map = new HashMap<>();
    
        HashMap<String, Member> map3 = new HashMap<>();
//        map3.put("asd", "문자열"); // 컴파일 오류!
        map3.put("asd",new Member("홍길동", 20));
        Member m = map3.get("aaa");
    }
}
