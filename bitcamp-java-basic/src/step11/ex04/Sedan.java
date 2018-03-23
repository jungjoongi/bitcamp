// 기존의 클래스를 손데지 않고 새 기능만 추가한다.
// 어떻게? 상속문법을 이용한다.
package step11.ex04;

// 상속
// -> 재 사용할 기존 클래스를 지정한다. [extends step11.ex1.Car] - 가존 Car의 기능을 확장한다.
// -> 새 클래스에는 추가할 기능을 덧붙인다.

public class Sedan extends step11.ex01.Car{
    // 인스턴스 변수 추가
    boolean sunloof;
    boolean auto;
    
    public Sedan(String model, String maker, int capacity,
            boolean sunloof, boolean auto) {
        this.model = model;
        this.maker = maker;
        this.capacity = capacity;
        this.sunloof = sunloof;
        this.auto = auto;
    }
}
