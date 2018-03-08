// 클래스 선언
package step03;

class Exam04_1 {
    public static void main(String[] args) {

        Score s1 = new Score();
   
        Score s2 = s1;
   
        s1.name = "홍길동";
   
        System.out.println(s2.name);
    }
}

