package step11.ex12;

public class Exam03_1 {
    static class Member {
        String name;
        int age;
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Member m1 = new Member("홍길동", 20);
        Member m2 = new Member("홍길동", 20);

        if (m1 == m2) {
            System.out.println("m1 == m2");
        } else {
            System.out.println("m1 != m2");
        }

        System.out.println(m1.equals(m2));
        
        // equals는 인스턴스 값이 같은지 확인하는 것!
        // 내용이 같은지 비교하려면?
        // 오버라이딩을 사용한다.
        // -> 즉 Object로부터 상속받은 메서드가 Member 클래스에 맞지 않다.
        //    그럼 Member클래스에 맞게끔 재정의하면 된다.
        //    Exam09_2를 봐라
    }



}
