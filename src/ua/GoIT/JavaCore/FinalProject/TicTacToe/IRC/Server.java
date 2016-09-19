package IRC;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(3001, 50, InetAddress.getLocalHost());
        System.out.println(InetAddress.getLocalHost() + " started successful!");
        //while (true) {
            Socket socket = serverSocket.accept();
            InputStream in = socket.getInputStream();
            byte[] data = new byte[in.available()];
            in.read(data);
            System.out.println("Server.data.length: " + data.length);
            System.out.println("Server: " + new String(data));
        //}
    }
}
