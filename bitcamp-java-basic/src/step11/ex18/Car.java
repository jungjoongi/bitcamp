package step11.ex18;

public abstract class Car {

    public Car() {
        super();
    }

    public void start() {
        System.out.println("시동건다.");
    }

    public void shutdown() {
        System.out.println("시동끈다..");
    }

    public void run() {
        System.out.println("달린다.");
    }

}