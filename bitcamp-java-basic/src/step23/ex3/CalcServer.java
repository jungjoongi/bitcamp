package step23.ex3;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServer {
    public static void main(String[] args) throws Exception {
        System.out.println("서버실행중");
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
                Socket socket = ss.accept();
                DataInputStream in = new DataInputStream(socket.getInputStream());
                PrintStream out = new PrintStream(socket.getOutputStream());
                
                int a = in.readInt();
                String op = in.readUTF();
                int b = in.readInt();
                
                int result = 0;
                switch (op) {
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/": result = a / b; break;
                }
                
                out.printf("%d %s %d = %d", a, op, b, result);
                
                in.close();
                out.close();
                socket.close();
        }
        //ss.close();
    }
}
