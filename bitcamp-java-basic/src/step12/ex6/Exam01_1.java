package step12.ex6;

import java.util.HashMap;

public class Exam01_1 {
    
    static class Mykey {
        String major;
        int no;
        
        public Mykey(String major, int no) {
            this.major = major;
            this.no = no;
        }

        @Override
        public String toString() {
            return "Mykey [major=" + major + ", no=" + no + "]";
        }
        
        
        
    }

    public static void main(String[] args) {
        Member v1 = new Member("홍길동", 20);
        Member v2 = new Member("임꺽정", 30);
        Member v3 = new Member("유관순", 16);
        Member v4 = new Member("안중근", 20);
        Member v5 = new Member("윤봉길", 16);
        
        Mykey k1 = new Mykey("컴공", 1);
        Mykey k2 = new Mykey("컴공", 2);
        Mykey k3 = new Mykey("컴공", 3);
        Mykey k4 = new Mykey("컴공", 4);
        Mykey k5 = new Mykey("컴공", 5);
        
        HashMap map = new HashMap();
        
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
    
    System.out.println(map.get(k1));
    System.out.println(map.get(k2));
    System.out.println(map.get(k3));
    System.out.println(map.get(k4));
    System.out.println(map.get(k5));
    Mykey k6 = new Mykey("컴공", 3);
    System.out.println(map.get(k6));
    }

}
