// BufferedInputStream 사용후
package step22.ex7;

import java.io.FileInputStream;

public class Exam02_1 {
    public static void main(String[] args) throws Exception {
        
        FileInputStream fileIn = new FileInputStream("temp/jls8.pdf");
        BufferedInputStream in = new BufferedInputStream(fileIn);

        int b;

        long startTime = System.currentTimeMillis();
        
        int callcount = 0;
        while((b = in.read()) != -1) callcount++; ;
        
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(callcount);

        in.close();
    }
}
