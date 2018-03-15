// 메서드: 가변 파라미터의 단점ㄴ
package step06;
import java.util.Scanner;
public class Exam02_7 {
    
    // 가변 파라미터는 여러 개 선언할 수 없다.
    // -> 아규먼트의 시작과 끝을 구분할 수 없다.
    //      예) m1("aaa", "bbb", "ccc");
    //      어느 값이 names 배열에 들어가고, 어느 값이 name2 배열에 들어가는가?
    // static void m1(String...names, String...names2) {}

    // 가변파라미터는 반드시 맨 끝에 와야한다.
    // -> 아규먼트의 시작과 끝을 구분할 수 없다.
    //      예) m2("aaaaa")
    //static void m2(String...names, String a) {} // 컴파일 오류!
    //static void m2(String...names, int a) {} // 컴파일 오류!

    static void m2(int a, String...names) {} // 컴파일 가능
    
    

    //배열 파라미터는 여러 개 선언할 수 있다.
    static void x1(String[] names, String[] names2) {}

    // 배열 파라미터는 순서에 상관 없다.
    static void x1(String[] names, int a) {}
    
    public static void main(String[] args) {


        
    }
}