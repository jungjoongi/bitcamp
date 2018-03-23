package step11.ex11;

public class C2 extends C {
    // 다음은 C의 메서드를 오버라이딩 한 게 아니다!
    // 왜? m1()은 private이기 때문에 오직 C에서만 사용할 수 있다.
    // 그럼 다음 m1()은? 그냥 C2에 새로 추가한 메서드이다.
    // private는 상속불가!! 오버라이딩 안됨!
    @Override
    private void m1() {}
    
    protected void m2() {}
    @Override
    void m3() {}
    @Override
    public void m4() {}

}
