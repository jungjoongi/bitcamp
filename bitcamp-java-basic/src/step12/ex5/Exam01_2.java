// java.util.Hashset 클래스 사용
package step12.ex5;

import java.util.ArrayList;

// HashSet 사용처
// -> Set은 집합을 의미한다.
// -> 집합에서는 중복값을 허용하지 않는다.
// -> 값의 중복여부는 HashCode()의 리턴값이 같고, equals()의 검사 결과가 true일때
//    같은 값으로 취급한다.
// -> 즉 중복된 값을 저장하고싶지 않을때 HashSet을 사용한다.
public class Exam01_2 {
    public static void main(String[] args) {
        String v1 = new String("aaa");
        String v2 = new String("bbb");
        String v3 = new String("ccc");
        String v4 = new String("ddd");
        String v5 = new String("ccc");
        
        ArrayList list = new ArrayList();
        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5); 
        // v5와 v3는 다른 인스턴스이다. 하지만 두 객체에 들어있는 문자열은 같다.
        // String클래스는 인스턴스가 다르더라도 값이 같으면 hashCode()의 리턴값이 같도록 오버라이딩 하였다.
        // 또한 equals()의 리턴 값도 true가 되도록 오버라이딩 했다.
        
        // HashSet은 값의 중복을 검사할 때 인승턴스의 주소를 비교하지 말고
        // HashSet()의 리턴값과 euqals()의 리턴값으로 판단하였다.
        // HashCode()의 리턴값이 같고 두 객체에 대해 ueqals()를 호출하면
        // true가 리턴되기 때문에 같은 값으로 간주하여 중복저장하지 않는다
        // 결론 v5는 추가하지 않는다.
        print(list);
    }
    
    static void print(ArrayList set) {
        Object[] values = set.toArray();
        for (Object value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
