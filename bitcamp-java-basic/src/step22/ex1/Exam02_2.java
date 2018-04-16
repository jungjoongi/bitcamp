// Byte Stream - 바이트 단위로 읽기
package step22.ex1;

import java.io.FileInputStream;

public class Exam02_2 {
    public static void main(String[] args) throws Exception {
        
        FileInputStream in = new FileInputStream("temp/tsest1.data");
         
        // 바이트들을 저장할 배열을 준비한다.
        // -> 임시데이터를 저장하기 위해 만든 바이트 배열을 보통 "버퍼(buffer)"이라고 한다.
        byte[] buf = new byte[100];
        int count = in.read(buf);
        
        // 3) .출력 도구를 닫는다.
        // -> 항상 입출력 도구를 사용한 후 닫아야 한다.
        // -> 어떤 입출력 도구는 닫지 않으면 버퍼(임시메모리)에 남아있는 데이터가 출력되지 않고 버려질 것이다.
        in.close();
        System.out.printf("%d\n", count);
        for (int i = 0 ; i < count ; i++) {
            System.out.printf("%x ", buf[i]);
        }
        System.out.println();
    }
}
