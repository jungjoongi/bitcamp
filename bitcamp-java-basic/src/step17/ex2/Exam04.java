// 상수 변수를 활용하여 분류 코드를 다루기
package step17.ex2;

import static step17.ex2.Category2.*;

public class Exam04 {
    public static void main(String[] args) {
        Product2 p = new Product2();
        //p.category = Category2.appliance.TV;
        p.category = appliance.TV;
        
        p.name = "울트라비전 뷰";
        p.price = 2000000;

    }

}
