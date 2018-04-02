package step12.ex5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Exam02_3 {

    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        String s5 = new String("eee");
        
        Stack stack = new Stack();
        stack.add(s1);
        stack.add(s2);
        stack.add(s3);
        
        System.out.println(stack.get(0));
        System.out.println(stack.get(1));
        System.out.println(stack.get(2));
        
        System.out.println(stack.size());
        
        System.out.println(stack.remove(1)); // aaa, ccc, 
        print(stack); 
        
        stack.add(s4); // aaa, ccc, ddd
        stack.add(0, "eee"); // aaa, eee, ccc, ddd
        print(stack);
        
        `
        Iterator 컬렉션에서값을꺼내주는객체 = stack.iterator();
        
        // => 값을 꺼내주는 객체를 통해 값을 꺼낸다.
        while (컬렉션에서값을꺼내주는객체.hasNext()) {
            // => 꺼낼 데이터가 있다면 값을 꺼내달라고 명령한다.
            System.out.print(컬렉션에서값을꺼내주는객체.next() + ", ");
        }
        System.out.println();
        
        
    }
        
    
    static void print(Stack list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }

}






