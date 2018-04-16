package step23.ex1;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class FileSender {
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        Socket socket = new Socket("192.168.0.33", 8888);
        FileInputStream read = new FileInputStream("temp/um.jpg");
        
        socket.getOutputStream();
        socket.getInputStream();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        int d;
        while((d = read.read()) != -1) {
        if (d == -1)
            break;
            out.println(d);
        }
        
        out.println("quit");
        in.close();
        out.close();
        socket.close();
    }
}
