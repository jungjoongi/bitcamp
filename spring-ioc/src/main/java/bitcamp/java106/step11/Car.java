package bitcamp.java106.step11;

import java.sql.Date;

import org.springframework.stereotype.Component;
//@Component
// => 스프링 IoC 컨테이너는 이 애노테이션이 붙은 클래스에 대해 객체를 자동 생성한다.
// 문법:
// @Component(value="객체이름")
// @Component("객체이름")
// 만약 다음과 같이 객체의 이름을 생략하면 클래스 이름을 객체 이름으로 사용한다.
// 예) bitcamp.java106.steo98.Car => "Car"
@Component
public class Car {
    String model;
    String maker;
    int cc;
    Date createdDate;
    boolean auto;
    Engine engine;
    
    // 의존 객체는 생성자에서 주입하는 것이 좋다.
    // 의존 객체라는 말에서 이미 그 객체 없이는 작업을 수행할 수 없다는 의미이기 때문에
    // 보통 필수 객체이다.
    // 따라서 생성자에서 필수 객체를 받게 하는 것이 유지보수에 좋다.
    // 즉 의존객체 없이 해당 객체를 생성하는 일을 방지할 수 있다.
    public Car(Engine engine) {
        this.engine = engine;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public boolean isAuto() {
        return auto;
    }
    public void setAuto(boolean auto) {
        this.auto = auto;
    }
    /*
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
     */
    @Override
    public String toString() {
        return "Car [model=" + model + ", maker=" + maker + ", cc=" + cc + ", createdDate=" + createdDate + ", auto="
                + auto + ", engine=" + engine + "]";
    }



    
}