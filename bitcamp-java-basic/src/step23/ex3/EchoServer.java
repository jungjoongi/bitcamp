package step23.ex3;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        System.out.println("서버실행중");
        ServerSocket ss = new ServerSocket(8888);
        
        Socket socket = ss.accept();
        
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        String str = in.nextLine();
        out.println(str);
        
        in.close();
        out.close();
        socket.close();
        ss.close();
    }
}
