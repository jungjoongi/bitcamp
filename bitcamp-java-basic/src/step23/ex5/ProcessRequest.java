package step23.ex5;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ProcessRequest {
    static int sum = 0;
    String name;
    void processRequest(Socket socket, String str, String name2) throws Exception {
        name = name2;
        System.out.println("숫자를 입력하세요");
        try (
                Socket socket2 = socket;
                PrintStream out = new PrintStream(socket.getOutputStream());
                Scanner in = new Scanner(socket.getInputStream());
                ) {

            // 클라이언트와 연결되면 클라이언트는 값을 한 개 보낸다. 
            // 서버는 그 클라이언트의 값을 기존 합계에 추가해야 한다.

            if (str.equals("")) {
                out.println("결과 = " + sum);
                return;
            }
            sum += Integer.parseInt(str);

        }
    }

}