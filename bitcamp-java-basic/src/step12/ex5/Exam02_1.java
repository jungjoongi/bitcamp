// java.util.Hashset 클래스 사용 - 저장순서를 따지지 않는다.
package step12.ex5;

import java.util.HashSet;

public class Exam02_1 {
    public static void main(String[] args) {
        String v1 = new String("aaa");
        String v2 = new String("bbb");
        String v3 = new String("ccc");
        String v4 = new String("ddd");
        String v5 = new String("ccc");
        
        HashSet set = new HashSet();
        set.add(v1);
        set.add(v2);
        set.add(v3);
        set.add(v4);
        set.add(v5); 
    }
    
    
}
