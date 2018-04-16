package step23.ex1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver2 {
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888);
        
        
        Socket socket = serverSocket.accept();
        
        socket.getOutputStream();
        socket.getInputStream();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        String str = in.nextLine();
        System.out.println(str);

        str = keyScan.nextLine();
        out.println("입력> ");
        out.println(str);
        
        
        in.close();
        out.close();
        socket.close();
        keyScan.close();
    }
}
