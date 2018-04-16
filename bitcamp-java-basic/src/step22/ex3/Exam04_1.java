// 데이터 출력 - String 출력
package step22.ex3;

import java.io.FileOutputStream;

public class Exam04_1 {

    public static void main(String[] args) throws Exception {
        FileOutputStream out = new FileOutputStream("temp/test3.data");
        
        // 우리나라 1년 예산
        String str = "AB가각간"; 

        out.write(str.getBytes("UTF-8"));
        
        
        out.close();
        
        System.out.println("데이터 출력 완료!");

    }

}
