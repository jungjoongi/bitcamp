// 다형성 - 다형적 변수와 형변환
package step11.ex9;

public class Exam03 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();

        
        // model과 capacity 변수는 원래 Vehicle 설곋에 있는 변수이기 때문에
        // 당연히 레퍼런스를 통해 사용할 수 있다.
        
        v1.model = "티코";
        v1.capacity = 5;
        
        
        
        Sedan s = (Sedan)v1; // JVM이 형변환을 처리할 때 진짜 Sedan객체가 맞는지
                             // 검사한다. 따라서 실행 오류 발생!
        s.cc = 1980; // 
        s.valve = 16; // 
        s.issunroof = true; // ㄴ
        s.isauto = true; // 
        System.out.printf("%s, %d, %d, %d, %b, %b\n",
                v1.model, v1.capacity, s.cc, s.valve, 
                s.issunroof, s.isauto);

        
    }
}
