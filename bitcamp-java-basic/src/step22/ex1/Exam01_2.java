// Byte Stream - 바이트 단위로 읽기
package step22.ex1;

import java.io.FileInputStream;

public class Exam01_2 {
    public static void main(String[] args) throws Exception {
        
        // 1) 파일로 출력하는 객체를 준비
        FileInputStream in = new FileInputStream("temp/tsest1.data");
         
        // 2) 1바이트를 읽는다. 타입이 int여도 1바이트를 읽어 리턴한다.
        //int값을 아규먼트로 넘기더라도 맨 마지막 1바이트만 출력한다.
        int b = in.read();
        
        // 3) 출력 도구를 닫는다.
        // -> 항상 입출력 도구를 사용한 후 닫아야 한다.
        // -> 어떤 입출력 도구는 닫지 않으면 버퍼(임시메모리)에 남아있는 데이터가 출력되지 않고 버려질 것이다.
        in.close();
        System.out.printf("%x\n", b);
    }
}
