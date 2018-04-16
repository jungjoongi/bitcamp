// BufferedInputStream 사용후
package step22.ex5;


public class Exam03_1 {
    public static void main(String[] args) throws Exception {

        BufferedInputStream in = new BufferedInputStream("temp/jls8.pdf");

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
