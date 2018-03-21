// String - "Hello" vs new String("Hello")
package step10;

public class Exam01_1 {
    public static void main(String[] args) {
        // String 인스턴스를 생성하는 방법
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        // -> 내용물이 같은지 내용물에 동일 요부를 검사하지 않고 모조건 인스턴스를 생성한다.
        // -> 가비지가 되면 가비지 컬렉터에 의해 제거된다.
        if (s1 == s2)
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");
        
        
        // string constant pool 메모리 영역에 String 인스턴스 만들기
        String x1 = "Hello";
        String x2 = "Hello";
        if (x1 == x2)
            System.out.println("x1 == x2");
        else
            System.out.println("X1 != x2");
        
        // constant pool영역에 만들어놓은 인스턴스 값을 검색해서 x1,x2,x3.. 레퍼런스 값에 넣는다.
        // String x1 = "Hello"; 은 constant pool영역에 인스턴스를 만들고 x1에다가 넣고 x2,x3..은 constant pool영역에 같은 데이터가 있는지
        // 찾은후 x1,x2라는 레퍼런스 방에다가 값을 넣는다. (없으면 인스턴스 값을 만든다)
        
        // -> 내용물이 같으면 기존 인스턴스의 주소를 리턴한다.
        //    즉 메모리 절약을 위해 중복 데이터를 갖는 인슽언스를 생성하지 않는다.
        // -> JVM이 끝날 때 까지 메모리에 유지된다.
        
        
        
    }
}
