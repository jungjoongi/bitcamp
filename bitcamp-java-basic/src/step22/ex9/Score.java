package step22.ex9;

import java.io.Serializable;

public class Score implements Serializable {
    private static final long serialVersionUID = 1;
    
    String name;
    int kor;
    int eng;
    int math;
    transient int sum;
    transient float aver;
    
    public Score() {
        System.out.println("score()");
    }
    
    @Override
    public String toString() {
        return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", aver="
                + aver + "]";
    }

    public void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
