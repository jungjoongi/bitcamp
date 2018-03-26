package step11.ex13;

public class Car {
    String model;
    String maker;
    int cc;
    int valve;

    private Car() {}
    // 대신 객체를 생성해주는 static 메서드를 준비한다.
    public static Car create(String name) {
        Car c = new Car();
        switch (name) {
        case "티코":
            c.model = "티코";
            c.maker = "대우";
            c.cc = 800;
            c.valve = 16;
            break;

        case "소나타":
            c.model = "소나타";
            c.maker = "현대자동차";
            c.cc = 800;
            c.valve = 16;
            break;

        default:
            c.model = "모델S";
            c.maker = "테슬라";
            c.cc = 0;
            c.valve = 0;
        }
        return c;
    }
}



