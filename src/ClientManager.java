import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientManager {
    private BufferedReader reader;
    private PrintWriter writer;
    private Socket socketClient;

    private void createClient() {
        try {
            Socket socket = new Socket();
            System.out.println("create user: ");
        }catch (Exception e){

        }
    }

    private void connectServer(InetAddress ip, int port) throws IOException {
        socketClient = new Socket(ip, port);
    }


    private void saveClient(){

    }


}
