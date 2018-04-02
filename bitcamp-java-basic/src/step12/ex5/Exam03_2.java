// HashSet과 사용자정의 데이터타입
package step12.ex5;

import java.util.HashSet;

// HashSet 사용처
// -> Set은 집합을 의미한다.
// -> 집합에서는 중복값을 허용하지 않는다.
// -> 값의 중복여부는 HashCode()의 리턴값이 같고, equals()의 검사 결과가 true일때
//    같은 값으로 취급한다.
// -> 즉 중복된 값을 저장하고싶지 않을때 HashSet을 사용한다.
public class Exam03_2 {
    static class Member {
        String name;
        int age;
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
            
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + age;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
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
            Member other = (Member) obj;
            if (age != other.age)
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }
        @Override
        public String toString() {
            return "Member [name=" + name + ", age=" + age + "]";
        }
    }
    public static void main(String[] args) {
        Member v1 = new Member("홍길동", 20);
        Member v2 = new Member("임꺽정", 30);
        Member v3 = new Member("유관순", 16);
        Member v4 = new Member("안중근", 20);
        Member v5 = new Member("유관순", 16);
        HashSet set = new HashSet();
        set.add(v1);
        set.add(v2);
        set.add(v3);
        set.add(v4);
        set.add(v5); 
        // v5와 v3는 다른 인스턴스이다. 하지만 두 객체에 들어있는 문자열은 같다.
        // String클래스는 인스턴스가 다르더라도 값이 같으면 hashCode()의 리턴값이 같도록 오버라이딩 하였다.
        // 또한 equals()의 리턴 값도 true가 되도록 오버라이딩 했다.
        
        // HashSet은 값의 중복을 검사할 때 인승턴스의 주소를 비교하지 말고
        // HashSet()의 리턴값과 euqals()의 리턴값으로 판단하였다.
        // HashCode()의 리턴값이 같고 두 객체에 대해 ueqals()를 호출하면
        // true가 리턴되기 때문에 같은 값으로 간주하여 중복저장하지 않는다
        // 결론 v5는 추가하지 않는다.
        print(set);
    }
    
    static void print(HashSet set) {
        Object[] values = set.toArray();
        for (Object value : values) {
            System.out.println(value + ", ");
        }
        System.out.println();
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
