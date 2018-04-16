package step23.ex1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver3 {
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888);


        Socket socket = serverSocket.accept();

        socket.getOutputStream();
        socket.getInputStream();

        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());

        while(true) {
            String str = in.nextLine();
            System.out.println(str);

            String input = keyScan.nextLine();
            out.println(input);

            if(input.equals("quit"))
                break;
        }
        in.close();
        out.close();
        socket.close();
        keyScan.close();
    }
}
