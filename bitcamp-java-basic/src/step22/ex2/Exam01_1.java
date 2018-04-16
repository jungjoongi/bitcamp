// character stream 단위로 읽기 - 문자출력하기 
package step22.ex2;

import java.io.FileWriter;

public class Exam01_1 {
    public static void main(String[] args) throws Exception {
        // 문자 
        FileWriter out = new FileWriter("Temp/test2.txt");
        
        out.write(0x7a6bac00);
        
        out.close();
        
        System.out.println("출력완료!");
    }
}
