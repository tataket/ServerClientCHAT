import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    public Server() {
    }

    public void turnOnServer() throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
