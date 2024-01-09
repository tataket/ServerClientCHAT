import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private BufferedReader reader;
    private PrintWriter writer;
    private Socket socketClient;


    private void comunicateClient() throws IOException {
    writer = new PrintWriter(socketClient.getOutputStream(), true);   //limpar+escrever
    reader = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));  //ler
}

}
