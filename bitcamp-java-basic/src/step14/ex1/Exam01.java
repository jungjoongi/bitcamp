package step14.ex1;

public class Exam01 {

    public static void main(String[] args) {

        Worker w1 = new BlueWorker();
        //Worker w2 = new String();  // 인터페이스를 구현하지 않은 클래스라 생성자 만들수 없음!!
        Worker w2 = new WhiteWorker();
        Worker w3 = new JubuWorker();

        w1.execute();
        w2.execute();
        w3.execute();

    
    }
}
