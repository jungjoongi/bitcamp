// 메서드 분류 - 인스턴스 변수와 인스턴스 메서드
package step07; 

public class ExamY_5 {
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
        Calculator4 c1 = new Calculator4(); // 식1의 계산 결과를 보관할 메모리 준비
        Calculator4 c2 = new Calculator4(); // 식2의 계산 결과를 보관할 메모리 준비
        
        // 계산을 수행할 떄 곗ㄴ 겨로가를 보관할 메모리를 전달하라!
        // -> 인스턴스 메서드를 사용하면 파라미터로 메모리 주소를 전달할 필요가 없다.
        
        // 식1과 식2를 개별적으로 동시에 진행할 수 없다.
        c1.plus(2);
        c2.plus(3); 
     
        c1.plus(3);
        c2.multiple(2);
        
        c1.minus(1);
        c2.plus(7);
        
        c1.multiple(7);
        c2.divide(4);
        
        c1.divide(3);
        c2.minus(5);

        System.out.printf("result = %d\n", c1.result);
        System.out.printf("result = %d\n", c2.result);

    }
}