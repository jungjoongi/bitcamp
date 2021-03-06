package step11.ex13;

public class Customer3 {
    private String name;
    private int age;
    private int weight;
    private int height;

    // 외부에서 인스턴스 변수에 접근을 못하기 때문에 값을 넣거나 조회할 수 없다.
    // 그래서 이를 가능하게 하는 수단/방법(method)을 제공해야 한다.

    // 인스턴스 변수 name의 값을 넣는 메서드
    // 보통 메서드 명은 set으로 시작한다.
    public void setName(String name) {
        // 이 메서드에서 이름값이 유효한지 검사한ㄷ.
        if (name == null) { 
            this.name = "이름없음";
            return;
        }

        if (name.length() < 2) {
            this.name = "이름없음";
            return; 
        }
        // 이름은 최대 5자만 넣는다.
        if (name.length() > 5) {
            this.name = name.substring(0,5);
            return;
        } else {
            this.name = name;
            return;
        }
    }

    public void setAge(int age) {
        if (age < 1 && age > 120) {
            this.age = 0;
            return;
        }
        this.age = age;
        return;
    }

    public void setWeight(int weight) {
        if (weight < 1 && weight > 200) {
            this.weight = 0;
            return;
        }
        this.weight = weight;
        return;
    }

    public void setHeight(int height) {
        if (height < 1 && height > 300) {
            this.height = 0;
            return;
        }
        this.height = height;
        return;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getHeight() {
        return this.height;
    }


}