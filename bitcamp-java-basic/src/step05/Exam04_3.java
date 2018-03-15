// for 반복문의 초기화 변수
package step05;
import java.util.Scanner;

public class Exam04_3 {
    public static void main(String[] args) {
        
        String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);

        System.out.println("---------------------");

        for (String name : names)
        System.out.println(name); // 모든 배열을 전부 꺼내서 뽑아냄


    }
}