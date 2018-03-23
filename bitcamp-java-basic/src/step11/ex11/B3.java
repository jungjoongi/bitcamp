package step11.ex11;

public class B3 extends B {
    // 오버라이딩 문법 검사
    // @Override를 메서드 앞에 쓰면 컴파일러가 실수했는지 검사한다. (실시간!) 
    @Override
    void m(int x) {
        System.out.println("B2의 m()");
    }
}
