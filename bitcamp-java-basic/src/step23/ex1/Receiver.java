package step23.ex1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        
        
        Socket socket = serverSocket.accept();
        
        socket.getOutputStream();
        socket.getInputStream();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        String str = in.nextLine();
        System.out.printf("상대편> %s\n", str);

        out.println("졸지마세여 형");
        
        
        in.close();
        out.close();
        socket.close();
    }
}
