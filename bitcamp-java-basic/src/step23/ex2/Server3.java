// 대기열 - 서버에 연결을 요청한 후 대기중인 클라이언트의 목록
package step23.ex2;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server3 {
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("서버 실행!");
        
        keyScan.nextLine();
        ServerSocket ss = new ServerSocket(8888, 2);
        System.out.println("클라이언트 연결을 기다리는중");
        // 서버의 대기열에 접속 순서대로 대기한다.
        
        keyScan.nextLine();
        Socket socket = ss.accept();
        System.out.println("대기중인 클라이언트중 한 개의 클라이언트에 대해 연결 승인");
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        System.out.println("입출력 스트림 준비!"); 
        
        keyScan.nextLine();
        
        System.out.println("클라이언트 데이터 수신중...");
        System.out.println(in.nextLine());
        System.out.println("클라이언트 데이터 수신 완료!");
        
        System.out.println("클라이언트에게 응답 보냄");
        out.println("ok!");
        
        socket.close();
        System.out.println("클라이언트와의 연결 해제!");
        ss.close();
        System.out.println("서버 종료!");
    }
}
