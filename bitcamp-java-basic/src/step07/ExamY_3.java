// 메서드 분류 - 클래스 변수의 단점
package step07; 

public class ExamY_3 {
    public static void main(String[] args) {
        // 클래스 변수는 오직 한개만 존재하기 때문에
        // 여러개의 작업을 동시에 진행할 수 없다.
        
        // 다음 두개의 식을 분리하여 계산해보자.
        // 식1) 2 + 3 - 1 * 7 / 3 = ?
        // 식2) 3 * 2 + 7 / -  = ? 
        
        // 식1과 식2를 개별적으로 동시에 진행할 수 없다.
        Calculator2.plus(2);
        Calculator2.plus(3);
        Calculator2.minus(1);
        Calculator2.multiple(7);
        Calculator2.divide(3);

        System.out.printf("result = %d\n", Calculator2.result);

    }
}