package week_7.class_activity_5;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // Create a client socket and connect to the server socket on port 12345
        Socket socket = new Socket("localhost", 8080);

        // 5A Read and write from both ends
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message1 = "";
        String message2 = "";

        while (!message1.equalsIgnoreCase("stop")){
            message1 = br.readLine();
            outputStream.writeUTF(message1);
            message2 = input.readUTF();
            System.out.println("Server says : " + message2);

        }
        input.close();
        outputStream.close();


    }
}
