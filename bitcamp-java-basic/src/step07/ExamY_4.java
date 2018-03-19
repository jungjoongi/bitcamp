// 메서드 분류 - 인스턴스 변수
package step07; 

public class ExamY_4 {
    public static void main(String[] args) {
        // 각각의 계산결과를 개별적으로 관리하고 싶은가?
        // 그렇다면 개별적으로 관리할 변수를 인스턴스 변수로 선언하라!
        
        // 클래스 변수는 오직 한개만 존재하기 때문에
        // 여러개의 작업을 동시에 진행할 수 없다.
        
        // 다음 두개의 식을 분리하여 계산해보자.
        // 식1) 2 + 3 - 1 * 7 / 3 = ?
        // 식2) 3 * 2 + 7 / -  = ? 
        
        // 두 개의 식의 계산 결과를 따로 관리하기 위해서는
        // result 변수를 개별적으로 생성해야 ㅎㄴ다.
        Calculator3 c1 = new Calculator3(); // 식1의 계산 결과를 보관할 메모리 준비
        Calculator3 c2 = new Calculator3(); // 식2의 계산 결과를 보관할 메모리 준비
        
        // 식1과 식2를 개별적으로 동시에 진행할 수 없다.
        Calculator3.plus(c1, 2);
        Calculator3.plus(c2, 3);
     
        Calculator3.plus(c1, 3);
        Calculator3.multiple(c2, 2);
        
        Calculator3.minus(c1, 1);
        Calculator3.plus(c2, 7);
        
        Calculator3.multiple(c1, 7);
        Calculator3.divide(c2, 4);
        
        Calculator3.divide(c1, 3);
        Calculator3.minus(c2, 5);

        System.out.printf("result = %d\n", c1.result);
        System.out.printf("result = %d\n", c2.result);

    }
}