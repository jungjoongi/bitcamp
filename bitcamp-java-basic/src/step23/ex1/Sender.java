package step23.ex1;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.0.33", 8888);
        
        socket.getOutputStream();
        socket.getInputStream();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        out.println("정준기");
        
        String str = in.nextLine();
        System.out.println(str);
        
        in.close();
        out.close();
        socket.close();
    }
}
