package step12.ex5;

import java.util.Iterator;
import java.util.LinkedList;

public class Exam02_2 {

    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        String s5 = new String("eee");
        
        LinkedList list = new LinkedList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        
        System.out.println(list.size());
        
        System.out.println(list.remove(1)); // aaa, ccc, 
        print(list); 
        
        list.add(s4); // aaa, ccc, ddd
        list.add(0, "eee"); // aaa, eee, ccc, ddd
        print(list);
        
        
        Iterator 컬렉션에서값을꺼내주는객체 = list.iterator();
        
        // => 값을 꺼내주는 객체를 통해 값을 꺼낸다.
        while (컬렉션에서값을꺼내주는객체.hasNext()) {
            // => 꺼낼 데이터가 있다면 값을 꺼내달라고 명령한다.
            System.out.print(컬렉션에서값을꺼내주는객체.next() + ", ");
        }
        System.out.println();
        
        
    }
        
    
    static void print(LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }

}






