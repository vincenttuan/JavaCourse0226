package lesson41_socket;

import java.io.OutputStream;
import java.net.Socket;

public class ClientSocket_Demo {
    public static void main(String[] args) throws Exception {
        String host = "127.0.0.1";
        int port = 5000;
        Socket socket = new Socket(host, port);
        while(true) {
            try(OutputStream output = socket.getOutputStream();) {
                int ch;
                while ((ch = System.in.read()) != 1) {                    
                    output.write(ch);
                }
            } catch (Exception e) {
            }
        }
    }
}
