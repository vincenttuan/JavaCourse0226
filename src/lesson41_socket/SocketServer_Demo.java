package lesson41_socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer_Demo {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        byte[] bytes = new byte[1024];
        while (true) {            
            System.out.println("---- server start ----");
            System.out.println("---- wait for client ----");
            Socket socket = server.accept();
            System.out.println("---- client login ----");
            try(InputStream is = socket.getInputStream()) {
                int len;
                while ((len = is.read(bytes)) != -1) {                    
                    System.out.write(bytes, 0, len);
                }
            } catch (Exception e) {
            }
        }
    }
}
