package step11.ex12;

public class Exam04 {
    public static void main(String[] args) {
        Member m1 = new Member("홍길동", 20);
        Member m2 = new Member("홍길동", 20);
        
        // 비록 m1과 m2는 같은 값을 가지고있지만, 인스턴스가 다르다.
        
        System.out.println(m1 == m2);
        
        
        // Object로부터 상속받은 hashCode()는 인스턴스마다 고유의 해쉬값을 리턴한다.
        System.out.printf("%x, %x\n", m1.hashCode(), m2.hashCode());
        
        // Object로부터 상속받은 toString()은 클래스@해시값 리턴
        System.out.printf("%s %s\n", m1.toString(), m2.toString());        
    
        // Object로부터 상속받은 equals()는 인스턴스가 같은지 검사한다.
        System.out.printf("%b\n", m1.equals(m2));      
        
        System.out.println("-----------------------");
        
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2);
        
        // Object로부터 상속받은 hashCode()는 인스턴스마다 고유의 해쉬값을 리턴한다.
        System.out.printf("%x, %x\n", s1.hashCode(), s2.hashCode());
        
        // Object로부터 상속받은 toString()은 클래스@해시값 리턴
        System.out.printf("%s %s\n", s1.toString(), s2.toString());        
    
        // Object로부터 상속받은 equals()는 인스턴스가 같은지 검사한다.
        System.out.printf("%b\n", s1.equals(s2));      
        
        
        
    }
}
