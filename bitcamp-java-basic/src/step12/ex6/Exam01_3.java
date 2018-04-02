package step12.ex6;

import java.util.HashMap;

public class Exam01_3 {
    
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

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((major == null) ? 0 : major.hashCode());
            result = prime * result + no;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Mykey other = (Mykey) obj;
            if (major == null) {
                if (other.major != null)
                    return false;
            } else if (!major.equals(other.major))
                return false;
            if (no != other.no)
                return false;
            return true;
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
