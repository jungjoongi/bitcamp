// 흐름제어문 - switch 문법
package step05;
import java.util.Scanner;

public class Exam02_3 {
    public static void main(String[] args) {
        // switch로 가능한 데이터 타입?
        // 4바이트 이하 정수(int, short, byte, char), 문자열, 틀별한 상수 Enum
        // case값으로 변수를 사용할 수 없다. 리터럴만 가능하다.
        byte b = 20;
        switch (b) {
        case 1:
        case 2:
        default:
        } 
        
        short s = 20;
        switch (s) {
        case 1:
        case 2:
        default:    
        } 

        int i = 20;
        switch (i) {
        case 1:
        case 2:
        default:
        } 
      
        // long l = 20;
        // switch (l) {
        // case 1:
        // case 2:
        // default:
        // }  // long 컴파일 오류!
    
        char c = 'A';
        switch ('A') {
        // case의 값도 int값이면 무엇이든 된다.
        case 66:
        case 0x43:
        default:
        } 

        // String값을 switch와 case의 값으로 사용할 수 있다.
        String str ="hello";
        switch (str) {
        case "hello":
        case "ohara":
        default:
        } 

        // boolean 값을 switch와 case에 사용할 수 없다.
        /*
        boolean bool = true;
        switch (bool) {
        case "hello":
        case "ohara":
        default:
        } 
        */

        /* case에는 리터럴만 올 수 있다.
        int x = 1, y = 300;
        switch(x) {
        case 1 * y:
        }
        */
    }
}