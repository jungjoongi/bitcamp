package step12.ex6;

import java.util.HashMap;
import java.util.Set;

public class Exam03_2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        Member v1 = new Member("s01", 20);
        Member v2 = new Member("s02", 30);
        Member v3 = new Member("s03", 16);
        Member v4 = new Member("s04", 20);
        Member v5 = new Member("s05", 25);
        
        map.put("s01", v1);
        map.put("s02", v2);
        map.put("s03", v3);
        map.put("s04", v4);
        map.put("s05", v5);
        
        Set keys = map.keySet();
        
        map.remove("s01");
        map.remove("s02");
        map.remove("s03");

        for (Object key : keys) {
            System.out.println(key);
        }
    }
}
