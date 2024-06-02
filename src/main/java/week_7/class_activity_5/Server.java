package week_7.class_activity_5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // Create a server socket on port 12345
        ServerSocket server = new ServerSocket(8080);

        System.out.println("server waiting for client...");

        // Accept client connections
        Socket clentSocket = server.accept();

        System.out.println("Client connected");

        // 5A Read and Write from both ends
        DataInputStream input = new DataInputStream(clentSocket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(clentSocket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message1 = "";
        String message2 = "";

        while (!message1.equalsIgnoreCase("stop")){
            message1 = input.readUTF();
            System.out.println("Client says : " + message1);
            message2 = br.readLine();
            outputStream.writeUTF(message2);

        }
        input.close();
        server.close();
        clentSocket.close();
    }
}
