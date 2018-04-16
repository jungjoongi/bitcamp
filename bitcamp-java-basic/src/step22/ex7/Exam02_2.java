// 버퍼사용전 - 파일복사 및 시간 측정
package step22.ex7;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam02_2 {
    public static void main(String[] args) throws Exception {

        FileInputStream fileIn = new FileInputStream("temp/jls8.pdf");
        FileOutputStream fileOut = new FileOutputStream("temp/jls8_5.pdf");
        BufferedInputStream in = new BufferedInputStream(fileIn);
        BufferedOutputStream out = new BufferedOutputStream(fileOut);

        int b;
        
        long startTime = System.currentTimeMillis();
        while((b = in.read()) != -1) {
            out.write(b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        in.close();
        out.close();
    }
}
