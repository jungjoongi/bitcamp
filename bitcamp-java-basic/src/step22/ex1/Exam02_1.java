// Byte Stream - 바이트 배열출력하기
package step22.ex1;

import java.io.FileOutputStream;

public class Exam02_1 {
    public static void main(String[] args) throws Exception {
        
        // 1) 파일로 출력하는 객체를 준비
        FileOutputStream out = new FileOutputStream("temp/tsest1.data");
         
        byte[] bytes = new byte[] {0x7a, 0x6b, 0x5c, 0x4d, 0x3e, 0x2f, 0x30};
        // 2) 1바이트를 출력한다.
        //int값을 아규먼트로 넘기더라도 맨 마지막 1바이트만 출력한다.
        out.write(bytes); // 바이트배열 전체를 출력한다.
        
        // 3) 출력 도구를 닫는다.
        // -> 항상 입출력 도구를 사용한 후 닫아야 한다.
        // -> 어떤 입출력 도구는 닫지 않으면 버퍼(임시메모리)에 남아있는 데이터가 출력되지 않고 버려질 것이다.
        out.close();
        System.out.println("데이터 출력 완료!");
    }
}
