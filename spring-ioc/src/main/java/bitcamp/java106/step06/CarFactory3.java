package bitcamp.java106.step06;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory3 implements FactoryBean<Car> {
    String model;
    
    
    public CarFactory3() {
        System.out.println("CarFactory3() 생성됨");
    }
    public void setModel(String model) {
        System.out.println("setModel() 생성됨");
        this.model = model;
    }
    @Override
    public Class<?> getObjectType() {
        System.out.println("getObjectType() 생성됨");
        return Car.class
                ;
    }
    @Override
    public Car getObject() throws Exception {
        System.out.println("getObject() 생성됨");
        // 객체를 생성해서 리턴하는 메서드이다.
        // 스프링 IoC컨테이너는 이 메서드를 호출할 것이다.
        // 객체를 생성할 때 추가적으로 값을 파라미터로 받을 수 없기 때문에
        // 프로퍼티로 받도록 해야한다.
       Car c = new Car();
       switch (model) {
       case "티코":
           c.setMaker("대우자동차");
           c.setModel("Tico");
           c.setCc(890);
           return c;

       case "소나타":
           c.setMaker("현대자동차");
           c.setModel("Sonata");
           c.setCc(1980);
           return c;

       case "SM5":
           c.setMaker("르노자동차");
           c.setModel("SM5");
           c.setCc(1990);
           return c;
       default :
           c.setMaker("비트자동차");
           c.setModel("자바휘웅");
           c.setCc(5000);
           return c;
       }
    }

    
    
}
