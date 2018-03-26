package step11.ex12;

public class Exam03_2 {
    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        // String 클래스에서 equals()를 오버라이딩 했기때문에
        // s1.equals(s2)의 결과값이 true가 나온 것이다.
        
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        // sb1.equals(sb2) 리턴값은 false이다
        // StrungBuffer은 Object로부터 상속받은 equals()를 오버라이딩 하지 않았다.
        // 그래서 Object의 equal()가 호출된 것이다.
    }



}
