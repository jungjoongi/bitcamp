package step11.ex13;

public class Customer4 {
    private String name;
    private int age;
    private int weight;
    private int height;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    

}
    // 외부에서 인스턴스 변수에 접근을 못하기 때문에 값을 넣거나 조회할 수 없다.
    // 그래서 이를 가능하게 하는 수단/방법(method)을 제공해야 한다.

    // 인스턴스 변수 name의 값을 넣는 메서드
    // 보통 메서드 명은 set으로 시작한다.
  
    