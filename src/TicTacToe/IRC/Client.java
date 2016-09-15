package IRC;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",3001);
        OutputStream out = socket.getOutputStream();
        out.write(("Test="+System.currentTimeMillis()).getBytes());
        //out.close();
        out.flush();
        out.close();
    }
}
